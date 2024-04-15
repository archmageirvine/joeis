package irvine.oeis.a033;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A033941 Number of ways A002808(n) can be properly factored into 2 integers.
 * @author Sean A. Irvine
 */
public class A033941 extends A002808 {

  @Override
  public Z next() {
    return Functions.SIGMA0.z(super.next()).subtract(1).divide2();
  }
}
