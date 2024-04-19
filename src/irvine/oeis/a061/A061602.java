package irvine.oeis.a061;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A061602 Sum of factorials of the digits of n.
 * @author Sean A. Irvine
 */
public class A061602 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    long m = ++mN;
    Z sum = Z.ZERO;
    do {
      sum = sum.add(Functions.FACTORIAL.z((int) (m % 10)));
      m /= 10;
    } while (m != 0);
    return sum;
  }
}

