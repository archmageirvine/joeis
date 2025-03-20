package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A076097 Products of rows in A076099.
 * @author Sean A. Irvine
 */
public class A076097 extends A076099 {

  @Override
  public Z next() {
    step();
    return Functions.PRODUCT.z(mA);
  }
}
