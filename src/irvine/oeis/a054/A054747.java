package irvine.oeis.a054;

import irvine.math.IntegerUtils;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.group.SymmetricGroup;
import irvine.math.partitions.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A054747 Number of inequivalent n-state 2-input 2-output automata with respect to an input permutation.
 * @author Sean A. Irvine
 */
public class A054747 extends Sequence1 {

  private static final MemoryFactorial FACTORIAL = MemoryFactorial.SINGLETON;
  private int mN = 0;

  private Z innerProduct(final int[] j, final int[] l, final int r) {
    // s = 1
    long s1 = 0;
    for (int t = 1; t < j.length; ++t) {
      if (r % t == 0) {
        s1 += (long) t * j[t];
      }
    }
    final Z sA = Z.valueOf(s1).multiply2().pow((long) j[r] * l[1]);
    // s = 2
    long s2 = 0;
    final int lim = (r & 1) == 0 ? r : 2 * r; // lcm
    for (int t = 1; t < j.length; ++t) {
      if (lim % t == 0) {
        s2 += (long) t * j[t];
      }
    }
    final Z sB = Z.valueOf(s2).multiply2().pow((long) j[r] * l[2] * IntegerUtils.gcd(r, 2));
    return sA.multiply(sB);
  }

  private Z outerProduct(final int[] j, final int[] l) {
    Z p = Z.ONE;
    for (int r = 1; r <= mN; ++r) {
      p = p.multiply(innerProduct(j, l, r));
    }
    return p;
  }

  private Z innerSum(final int[] j) {
    Z s = Z.ZERO;
    final IntegerPartition lp = new IntegerPartition(2);
    final int[] l = new int[3];
    int[] p;
    while ((p = lp.next()) != null) {
      IntegerPartition.toCountForm(p, l);
      s = s.add(Z.TWO.multiply(outerProduct(j, l)).divide(SymmetricGroup.per(l)));
    }
    return s;
  }

  private Z outerSum() {
    Z s = Z.ZERO;
    final IntegerPartition jp = new IntegerPartition(mN);
    final int[] j = new int[mN + 1];
    int[] p;
    while ((p = jp.next()) != null) {
      IntegerPartition.toCountForm(p, j);
      s = s.add(FACTORIAL.factorial(mN).multiply(innerSum(j)).divide(SymmetricGroup.per(j)));
    }
    return s;
  }

  @Override
  public Z next() {
    ++mN;
    return outerSum().divide(FACTORIAL.factorial(mN).multiply2());
  }
}
