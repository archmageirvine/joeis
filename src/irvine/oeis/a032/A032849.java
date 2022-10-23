package irvine.oeis.a032;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A032849 Numbers whose base-2 representation Sum_{i=0..m} d(i)*2^i has d(m) &lt;= d(m-1) &gt;= d(m-2) &lt;= ...
 * @author Sean A. Irvine
 */
public class A032849 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();
  private Z mLimit = Z.valueOf(base());
  private boolean mUp = initialDirection();

  {
    for (long k = 1; k < base(); ++k) {
      mA.add(Z.valueOf(k));
    }
  }

  protected long base() {
    return 2;
  }

  protected boolean initialDirection() {
    return true;
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
      for (long k = last; k < base(); ++k) {
        mA.add(t.add(k));
      }
    } else {
      for (long k = 0; k <= last; ++k) {
        mA.add(t.add(k));
      }
    }
    return res;
  }
}
