package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a009.A009717;

/**
 * A024233 Expansion of tan(tanh(x))*sin(x)/2.
 * @author Sean A. Irvine
 */
public class A024233 extends A009717 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

