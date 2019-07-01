package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a009.A009585;

/**
 * A024335 Expansion of <code>sinh(log(1+x)^2)/2</code>.
 * @author Sean A. Irvine
 */
public class A024335 extends A009585 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

