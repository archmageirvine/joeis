package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a009.A009748;

/**
 * A024271 E.g.f. tan(x)*tan(sin(x))/2, even powers only.
 * @author Sean A. Irvine
 */
public class A024271 extends A009748 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

