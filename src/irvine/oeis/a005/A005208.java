package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a025.A025280;

/**
 * A005208 Operator-oriented complexity of n, i.e., the minimum number of occurrences of +, *, and ^ needed to build n from a supply of ones.
 * @author Sean A. Irvine
 */
public class A005208 extends A025280 {

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}

