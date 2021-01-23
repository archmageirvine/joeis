package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a009.A009399;

/**
 * A024295 Expansion of log(1+tanh(x)*x)/2.
 * @author Sean A. Irvine
 */
public class A024295 extends A009399 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

