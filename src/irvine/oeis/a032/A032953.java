package irvine.oeis.a032;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032953 Numbers n such that base 3 representation Sum{d(i)*3^i: i=0,1,...,m} has even d(i) for all odd i.
 * @author Sean A. Irvine
 */
public class A032953 implements Sequence {

  private final TreeSet<Z> mA = new TreeSet<>();
  private Z mLimit = Z.valueOf(base());
  private boolean mUp = odd();

  {
    for (long k = start(); k < base(); ++k) {
      mA.add(Z.valueOf(k));
    }
  }

  protected boolean odd() {
    return true;
  }

  protected int base() {
    return 3;
  }

  protected long start() {
    return 1;
  }

  @Override
  public Z next() {
    final Z res = mA.pollFirst();
    if (res.compareTo(mLimit) >= 0) {
      mUp = !mUp;
      mLimit = mLimit.multiply(base());
    }
    final Z t = res.multiply(base());
    if (mUp) {
      for (long k = 0; k < base(); k += 2) {
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
