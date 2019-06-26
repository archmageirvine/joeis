package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a009.A009742;

/**
 * A024269 Expansion of <code>tan(x)*sin(tan(x))/2</code>.
 * @author Sean A. Irvine
 */
public class A024269 extends A009742 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

