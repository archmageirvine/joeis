package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a009.A009626;

/**
 * A024227 Expansion of <code>sinh(x)*sin(sin(x))/2</code>.
 * @author Sean A. Irvine
 */
public class A024227 extends A009626 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

