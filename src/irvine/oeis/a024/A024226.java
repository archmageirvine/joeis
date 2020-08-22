package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a009.A009508;

/**
 * A024226 Expansion of sin(tan(x))*x/2.
 * @author Sean A. Irvine
 */
public class A024226 extends A009508 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

