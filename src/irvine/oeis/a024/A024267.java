package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a009.A009514;

/**
 * A024267 Expansion of sin(tan(x)*sinh(x))/2.
 * @author Sean A. Irvine
 */
public class A024267 extends A009514 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

