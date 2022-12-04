package irvine.oeis.a060;

import irvine.math.z.Z;

/**
 * A060601.
 * @author Sean A. Irvine
 */
public class A060601 extends A060596 {

  {
    setOffset(9);
  }

  private int mN = 8;

  @Override
  public Z next() {
    return count(10, ++mN);
  }
}
