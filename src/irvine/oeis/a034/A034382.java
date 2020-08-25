package irvine.oeis.a034;

import java.util.Arrays;
import java.util.HashMap;

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

  private int mN = 0;
  private Z mF = Z.ONE;

  private final HashMap<String, Z> mCache = new HashMap<>();

  private Z aut(final Z p, final int[] k) {
    final String key = p + Arrays.toString(k);
    final Z res = mCache.get(key);
    if (res != null) {
      return res;
    }
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
    mCache.put(key, prod);
    return prod;
  }

  Z mSum = Z.ZERO;

  private void sum(final Z a, final FactorSequence fs, final Z[] p, final int k) {
    if (k >= p.length) {
      mSum = mSum.add(a);
      return;
    }
    final int e = fs.getExponent(p[k]);
    final IntegerPartition part = new IntegerPartition(e);
    final int[] c = new int[e + 1];
    int[] j;
    while ((j = part.next()) != null) {
      IntegerPartition.toCountForm(j, c);
      sum(a.divide(aut(p[k], c)), fs, p, k + 1);
    }
  }

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    final FactorSequence fs = Cheetah.factor(mN);
    mSum = Z.ZERO;
    sum(mF, fs, fs.toZArray(), 0);
    return mSum;
  }
}
