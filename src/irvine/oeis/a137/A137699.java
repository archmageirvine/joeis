package irvine.oeis.a137;

import irvine.math.z.Z;

/**
 * A137699.
 * @author Sean A. Irvine
 */
public class A137699 extends A137698 {

  @Override
  public Z next() {
    super.next();
    return mLastK;
  }
}
