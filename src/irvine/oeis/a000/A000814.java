package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000814.
 * @author Sean A. Irvine
 */
public class A000814 extends A000721 {

  @Override
  public Z next() {
    return f(++mN).apply(2).toZ();
  }
}
