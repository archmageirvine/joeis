package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a009.A009515;

/**
 * A024248 Expansion of <code>sin(tan(x)*x)/2</code>.
 * @author Sean A. Irvine
 */
public class A024248 extends A009515 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

