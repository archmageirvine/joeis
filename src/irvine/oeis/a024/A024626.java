package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a000.A000961;

/**
 * A024626 Positions of squares among the powers of primes (A000961).
 * @author Sean A. Irvine
 */
public class A024626 extends A000961 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (super.next().isSquare()) {
        return Z.valueOf(mN);
      }
    }
  }
}
