package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a009.A009549;

/**
 * A024284 Expansion of sin(x)*sin(tanh(x))/2.
 * @author Sean A. Irvine
 */
public class A024284 extends A009549 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

