package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a009.A009666;

/**
 * A024246 Expansion of <code>tan(sin(x))*sinh(x)/2</code>.
 * @author Sean A. Irvine
 */
public class A024246 extends A009666 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

