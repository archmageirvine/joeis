package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a009.A009751;

/**
 * A024252 Expansion of tan(x)*tan(tanh(x))/2.
 * @author Sean A. Irvine
 */
public class A024252 extends A009751 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

