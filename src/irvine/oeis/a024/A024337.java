package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a009.A009575;

/**
 * A024337.
 * @author Sean A. Irvine
 */
public class A024337 extends A009575 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

