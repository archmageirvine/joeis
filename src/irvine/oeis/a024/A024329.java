package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a009.A009325;

/**
 * A024329 Expansion of <code>log(1+log(1+x)^2)/2</code>.
 * @author Sean A. Irvine
 */
public class A024329 extends A009325 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

