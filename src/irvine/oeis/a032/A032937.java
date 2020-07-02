package irvine.oeis.a032;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032937 Numbers n such that base 2 representation <code>Sum{d(i)*2^(m-i): i=0,1,...,m}</code> has <code>d(i)=0</code> for all odd i, excluding 0. Here m is the position of the leading bit of <code>n</code>.
 * @author Sean A. Irvine
 */
public class A032937 implements Sequence {

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
    if (!Z.ZERO.equals(t)) {
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
