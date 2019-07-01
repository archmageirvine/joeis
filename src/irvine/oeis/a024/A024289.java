package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a009.A009700;

/**
 * A024289 Expansion of <code>tan(tan(x)).x/2</code>.
 * @author Sean A. Irvine
 */
public class A024289 extends A009700 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

