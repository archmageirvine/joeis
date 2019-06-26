package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a009.A009673;

/**
 * A024244 Expansion of <code>tan(sin(x)*x)/2</code>.
 * @author Sean A. Irvine
 */
public class A024244 extends A009673 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

