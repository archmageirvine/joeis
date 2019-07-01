package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a009.A009422;

/**
 * A024338 Expansion of <code>log(1+x)*log(1+tan(x))/2</code>.
 * @author Sean A. Irvine
 */
public class A024338 extends A009422 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

