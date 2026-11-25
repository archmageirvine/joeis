package irvine.oeis.a334;

import irvine.math.z.Z;
import irvine.oeis.a335.A335000;

/**
 * A334994 Orders of the groups PSL(m,q) in increasing order as q runs through the prime powers (without repetitions).
 * @author Gregory Morse
 */
public class A334994 extends A335000 {

  private Z mPrevious = Z.ZERO;

  @Override
  public Z next() {
    Z order;
    do {
      order = super.next();
    } while (order.equals(mPrevious));
    mPrevious = order;
    return order;
  }
}
