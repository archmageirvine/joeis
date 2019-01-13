package irvine.oeis.a005;

import irvine.math.z.Z;

/**
 * A005438.
 * @author Sean A. Irvine
 */
public class A005438 extends A005437 {

  {
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    super.next();
    return mPrev[(mPrev.length - 1) / 2 + 1];
  }
}

