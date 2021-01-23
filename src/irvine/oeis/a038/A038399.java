package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A038399 Concatenate first n nonzero Fibonacci numbers in reverse order.
 * @author Sean A. Irvine
 */
public class A038399 extends A000045 {

  private final StringBuilder mS = new StringBuilder();
  {
    super.next();
  }

  @Override
  public Z next() {
    mS.insert(0, super.next());
    return new Z(mS);
  }
}
