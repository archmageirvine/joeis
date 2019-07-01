package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a009.A009458;

/**
 * A024332.
 * @author Sean A. Irvine
 */
public class A024332 extends A009458 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

