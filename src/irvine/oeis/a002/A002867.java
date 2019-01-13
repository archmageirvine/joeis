package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.a000.A000246;

/**
 * A002867.
 * @author Sean A. Irvine
 */
public class A002867 extends A000246 {

  private int mN = -1;

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().shiftLeft(++mN);
  }
}
