package irvine.oeis.a032;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A032937 Numbers k whose base-2 representation Sum_{i=0..m} d(i)*2^(m-i) has d(i)=0 for all odd i, excluding 0. Here m is the position of the leading bit of k.
 * @author Sean A. Irvine
 */
public class A032937 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();
  private Z mLimit = Z.valueOf(base());
  private boolean mOdd = odd();

  {
    for (long k = start(); k < base(); ++k) {
      mA.add(Z.valueOf(k));
    }
  }

  protected boolean odd() {
    return true;
  }

  protected int base() {
    return 2;
  }

  protected long start() {
    return 1;
  }

  @Override
  public Z next() {
    final Z res = mA.pollFirst();
    if (res.compareTo(mLimit) >= 0) {
      mOdd = !mOdd;
      mLimit = mLimit.multiply(base());
    }
    final Z t = res.multiply(base());
    if (!t.isZero()) {
      if (mOdd) {
        mA.add(t);
      } else {
        for (long k = 0; k < base(); ++k) {
          mA.add(t.add(k));
        }
      }
    }
    return res;
  }
}
