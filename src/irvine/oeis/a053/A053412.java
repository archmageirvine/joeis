package irvine.oeis.a053;

import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.a003.A003266;

/**
 * A053412.
 * @author Sean A. Irvine
 */
public class A053412 extends A003266 {

  private int mN = 0;
  {
    super.next();
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (super.next().add(1).isProbablePrime()) {
        return Fibonacci.fibonacci(mN);
      }
    }
  }
}
