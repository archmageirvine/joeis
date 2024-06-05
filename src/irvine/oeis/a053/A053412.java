package irvine.oeis.a053;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a003.A003266;

/**
 * A053412 n-th nonzero Fibonacci numbers arising in A053408.
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
        return Functions.FIBONACCI.z(mN);
      }
    }
  }
}
