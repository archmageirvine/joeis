package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025146 (#1's in (s(1),...,s(n)) - (#1's in r(1),...,r(n)), where s = A025142 and r = A025143.
 * @author Sean A. Irvine
 */
public class A025146 extends A025144 {

  protected long mCount = 0;

  @Override
  protected boolean select(final long n) {
    if (!mA025142.isSet(n)) {
      ++mCount;
    }
    if (!mA025143.isSet(n)) {
      --mCount;
    }
    return false;
  }

  @Override
  public Z next() {
    super.next();
    return Z.valueOf(mCount);
  }
}
