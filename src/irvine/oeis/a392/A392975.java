package irvine.oeis.a392;

import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A392975 A Sisyphus sequence: a(0) = 0, a(1) = 1, a(2) = 2; for n &gt; 2, a(n) is the smallest unused positive integer having the same greatest prime factor as the sum of the previous terms.
 * @author Sean A. Irvine
 */
public class A392975 extends Sequence0 {

  private final TreeSet<Z> mUsed = new TreeSet<>();
  private Z mSum = null;
  private Z mLeastUnused = Z.THREE;

  @Override
  public Z next() {
    if (mSum == null) {
      mSum = Z.ZERO;
      return Z.ZERO;
    }
    if (mSum.isZero()) {
      mSum = Z.ONE;
      return Z.ONE;
    }
    if (mSum.isOne()) {
      mSum = Z.THREE;
      return Z.TWO;
    }
    while (mUsed.remove(mLeastUnused)) {
      mLeastUnused = mLeastUnused.add(1);
    }
    final Z gpf = Functions.GPF.z(mSum);
    Z k = mLeastUnused.divide(gpf).multiply(gpf);
    if (k.compareTo(mLeastUnused) < 0) {
      k = k.add(gpf);
    }
    while (!mUsed.add(k)) {
      k = k.add(gpf);
    }
    mSum = mSum.add(k);
    return k;
  }
}
