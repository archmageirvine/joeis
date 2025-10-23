package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000045;

/**
 * A081320 Largest 3-smooth divisor of n-th Fibonacci number.
 * @author Sean A. Irvine
 */
public class A081320 extends Sequence1 {

  private final Sequence mF = new A000045().skip();

  @Override
  public Z next() {
    Z f = mF.next().makeOdd();
    Z r = Z.ONE.shiftLeft(f.auxiliary());
    while (f.mod(3) == 0) {
      f = f.divide(3);
      r = r.multiply(3);
    }
    return r;
  }
}

