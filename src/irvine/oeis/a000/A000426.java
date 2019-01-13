package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000426.
 * @author Sean A. Irvine
 */
public class A000426 extends A000033 {

  @Override
  public Z next() {
    return super.next().divide(mN);
  }
}

