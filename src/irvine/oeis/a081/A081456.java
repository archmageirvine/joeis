package irvine.oeis.a081;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A081456 Product of entries in n-th row of triangle in A081454.
 * @author Sean A. Irvine
 */
public class A081456 extends A081454 {

  @Override
  public Z next() {
    step();
    return Functions.PRODUCT.z(mRow);
  }
}
