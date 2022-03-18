package irvine.oeis.a140;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a007.A007318;

/**
 * A140280 Product of digits of values in Pascal's triangle, by rows.
 * @author Georg Fischer
 */
public class A140280 extends A007318 {

  @Override
  public Z next() {
    return ZUtils.digitProduct(super.next(), 10);
  }
}
