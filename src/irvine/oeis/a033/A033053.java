package irvine.oeis.a033;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033053 Numbers n such that base 2 representation Sum{d(i)*2^i: i=0,1,...,m} has d(i)=1 when i&lt;&gt;m mod 2.
 * @author Sean A. Irvine
 */
public class A033053 implements Sequence {

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
    if (mOdd) {
      for (long k = 1; k < base(); k += 2) {
        mA.add(t.add(k));
      }
    } else {
      for (long k = 0; k < base(); ++k) {
        mA.add(t.add(k));
      }
    }
    return res;
  }
}
