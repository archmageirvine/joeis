package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a009.A009816;

/**
 * A024268 Expansion of <code>tanh(tan(x)*sinh(x))/2</code>.
 * @author Sean A. Irvine
 */
public class A024268 extends A009816 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

