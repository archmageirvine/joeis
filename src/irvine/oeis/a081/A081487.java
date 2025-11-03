package irvine.oeis.a081;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A081487 Sum of n-th row of triangle in A081485.
 * @author Sean A. Irvine
 */
public class A081487 extends A081485 {

  @Override
  public Z next() {
    step();
    return Functions.SUM.z(mRow);
  }
}
