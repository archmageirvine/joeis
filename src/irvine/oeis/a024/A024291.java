package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a009.A009746;

/**
 * A024291 Expansion of tan(x)*sinh(tan(x))/2.
 * @author Sean A. Irvine
 */
public class A024291 extends A009746 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

