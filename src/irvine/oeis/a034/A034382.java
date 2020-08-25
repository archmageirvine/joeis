package irvine.oeis.a034;

import java.util.Arrays;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034382 Number of labeled Abelian groups of order n.
 * @author Sean A. Irvine
 */
public class A034382 implements Sequence {

  // todo this is working for prime powers, but not p * q etc.
  // todo roughly we have Aut(pq)=Aut(p)*Aut(q)

  private int mN = 0;
  private Z mF = Z.ONE;

  private Z aut(final Z p, final int m, final int[] k) {
    Z prod = Z.ONE;
    for (int i = 1; i < k.length; ++i) {
      if (k[i] != 0) {
        Z t = Z.ONE;
        for (int j = 1; j < k.length; ++j) {
          if (i != j) {
            t = t.multiply(p.pow(Math.min(i, j) * k[j]));
          }
        }
        t = t.pow(k[i]);
        for (int j = 0; j < k[i]; ++j) {
          t = t.multiply(p.pow(k[i]).subtract(p.pow(j)));
        }
        t = t.multiply(p.pow((i - 1) * k[i] * k[i]));
        prod = prod.multiply(t);
      }
    }
    System.out.println(p + " " + m + " " + Arrays.toString(k) + " -> " + prod);
    return prod;
  }

  private Z aut(final Z p, final Z f, final int e) {
    Z sum = Z.ZERO;
    final IntegerPartition part = new IntegerPartition(e);
    final int[] c = new int[e + 1];
    int[] j;
    while ((j = part.next()) != null) {
      IntegerPartition.toCountForm(j, c);
      sum = sum.add(f.divide(aut(p, e, c)));
    }
    return sum;
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    mF = mF.multiply(mN);
    System.out.println("n=" + mN);
    final FactorSequence fs = Cheetah.factor(mN);
    Z sum = Z.ZERO;
    for (final Z p : fs.toZArray()) {
      sum = sum.add(aut(p, mF, fs.getExponent(p)));
//      final int e = fs.getExponent(p);
//      final IntegerPartition part = new IntegerPartition(e);
//      final int[] c = new int[e + 1];
//      int[] j;
//      while ((j = part.next()) != null) {
//        IntegerPartition.toCountForm(j, c);
//        sum = sum.add(mF.divide(aut(p, e, c)));
//      }
    }
    return sum;
  }
}
