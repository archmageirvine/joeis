package irvine.oeis.a262;

import irvine.math.z.Z;
import irvine.oeis.a002.A002420;

/**
 * A262543.
 * @author Sean A. Irvine
 */
public class A262543 extends A002420 {

  {
    super.next();
    super.next();
  }

  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.ZERO;
    }
    return super.next().abs();
  }
}

