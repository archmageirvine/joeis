package irvine.oeis.a036;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A036971 Numbers k such that the k-th Fibonacci number reversed is prime.
 * @author Sean A. Irvine
 */
public class A036971 extends A000045 {

  {
    setOffset(1);
  }

  private int mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Functions.REVERSE.z(super.next()).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}

