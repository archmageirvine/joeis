package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a009.A009525;

/**
 * A024273 Expansion of sin(tanh(x))*x/2.
 * @author Sean A. Irvine
 */
public class A024273 extends A009525 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

