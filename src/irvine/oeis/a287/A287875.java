package irvine.oeis.a287;

import irvine.math.z.Z;
import irvine.oeis.a230.A230627;

/**
 * A287875.
 * @author Sean A. Irvine
 */
public class A287875 extends A230627 {

  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.ONE;
    }
    return new Z(super.next().toString(2));
  }
}
