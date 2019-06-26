package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a009.A009833;

/**
 * A024282 Expansion of e.g.f. <code>tanh(x)*sin(sin(x))/2</code>, even powers only.
 * @author Sean A. Irvine
 */
public class A024282 extends A009833 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

