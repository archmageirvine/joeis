package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a009.A009564;

/**
 * A024343.
 * @author Sean A. Irvine
 */
public class A024343 extends A009564 {

  @Override
  public Z next() {
    return super.next().multiply2();
  }
}

