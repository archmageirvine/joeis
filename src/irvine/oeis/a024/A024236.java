package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a009.A009379;

/**
 * A024236 Expansion of log(1+tan(x)*x)/2.
 * @author Sean A. Irvine
 */
public class A024236 extends A009379 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

