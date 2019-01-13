package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000250.
 * @author Sean A. Irvine
 */
public class A000250 extends A000666 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
