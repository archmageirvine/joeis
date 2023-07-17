package irvine.oeis.a052;

import java.util.ArrayList;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a002.A002385;
import irvine.util.Permutation;

/**
 * A052480 Primes associated with A052507.
 * @author Sean A. Irvine
 */
public class A052480 extends A002385 {

  /** Construct the sequence. */
  public A052480() {
    super(0);
  }

  private final ArrayList<Z> mA = new ArrayList<>();
  private int mM = 0;

  private Permutation permuter(final Z prime) {
    final int[] cnts = ZUtils.digitCounts(prime);
    final int sum = (int) IntegerUtils.sum(cnts);
    final int[] digits = new int[sum];
    for (int k = 0, i = 0; k < cnts.length; ++k) {
      for (int j = 0; j < cnts[k]; ++j) {
        digits[i++] = k;
      }
    }
    return new Permutation(digits);
  }

  private Z permToZ(final int[] p) {
    Z t = Z.ZERO;
    for (int v : p) {
      t = t.multiply(10).add(v);
    }
    return t;
  }

  @Override
  public Z next() {
    if (++mM >= mA.size()) {
      mA.clear();
      mM = 0;
      final Z palin = super.next();
      final Permutation perm = permuter(palin);
      int[] p;
      while ((p = perm.next()) != null) {
        if (p[0] != 0) {
          final Z t = permToZ(p);
          if (t.isProbablePrime()) {
            mA.add(t);
          }
        }
      }
    }
    return mA.get(mM);
  }
}
