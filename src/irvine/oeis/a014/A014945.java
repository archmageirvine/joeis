package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014945.
 * @author Sean A. Irvine
 */
public class A014945 extends A014741 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
