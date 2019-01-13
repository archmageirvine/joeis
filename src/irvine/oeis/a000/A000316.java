package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000316.
 * @author Sean A. Irvine
 */
public class A000316 extends A000459 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().shiftLeft(mN);
  }
}
