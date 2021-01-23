package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a009.A009743;

/**
 * A024241 E.g.f. tan(x)*sin(tanh(x))/2 (even powers only).
 * @author Sean A. Irvine
 */
public class A024241 extends A009743 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

