package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.a000.A000364;

/**
 * A028296.
 * @author Sean A. Irvine
 */
public class A028296 extends A000364 {

  private boolean mNegate = true;

  @Override
  public Z next() {
    mNegate = !mNegate;
    return mNegate ? super.next().negate() : super.next();
  }
}
