package irvine.oeis.a033;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A033941 Number of ways <code>A002808(n)</code> can be properly factored into 2 integers.
 * @author Sean A. Irvine
 */
public class A033941 extends A002808 {

  @Override
  public Z next() {
    return Cheetah.factor(super.next()).sigma0().subtract(1).divide2();
  }
}
