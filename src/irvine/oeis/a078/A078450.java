package irvine.oeis.a078;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A078450 a(n) = product of terms in n-th row of A078448.
 * @author Sean A. Irvine
 */
public class A078450 extends A078448 {

  @Override
  public Z next() {
    step();
    return Functions.PRODUCT.z(mRow);
  }
}


