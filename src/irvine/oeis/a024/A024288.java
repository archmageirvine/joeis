package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a009.A009397;

/**
 * A024288 Expansion of <code>log(1+tanh(x)*sinh(x))/2</code>.
 * @author Sean A. Irvine
 */
public class A024288 extends A009397 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

