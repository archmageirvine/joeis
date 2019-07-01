package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a009.A009423;

/**
 * A024331.
 * @author Sean A. Irvine
 */
public class A024331 extends A009423 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

