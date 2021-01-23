package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a009.A009745;

/**
 * A024251 Expansion of tan(x)*sinh(sin(x))/2.
 * @author Sean A. Irvine
 */
public class A024251 extends A009745 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

