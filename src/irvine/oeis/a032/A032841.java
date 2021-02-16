package irvine.oeis.a032;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032841 Numbers whose base-3 representation Sum_{i=0..m} d(i)*3^i  has d(m) &lt; d(m-1) &gt; d(m-2) &lt; ...
 * @author Sean A. Irvine
 */
public class A032841 implements Sequence {

  private final TreeSet<Z> mA = new TreeSet<>();
  private Z mLimit = Z.valueOf(base());
  private boolean mUp = initialDirection();

  {
    for (long k = start(); k < base(); ++k) {
      mA.add(Z.valueOf(k));
    }
  }

  protected boolean initialDirection() {
    return true;
  }

  protected long base() {
    return 3;
  }

  protected long start() {
    return 1;
  }

  @Override
  public Z next() {
    final Z res = mA.pollFirst();
    final long last = res.mod(base());
    if (res.compareTo(mLimit) >= 0) {
      mUp = !mUp;
      mLimit = mLimit.multiply(base());
    }
    final Z t = res.multiply(base());
    if (mUp) {
      for (long k = last + 1; k < base(); ++k) {
        mA.add(t.add(k));
      }
    } else {
      for (long k = 0; k < last; ++k) {
        mA.add(t.add(k));
      }
    }
    return res;
  }
}
