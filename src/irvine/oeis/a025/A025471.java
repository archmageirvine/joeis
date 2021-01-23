package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.a000.A000961;

/**
 * A025471 Position of 5^n among the powers of primes (A000961).
 * @author Sean A. Irvine
 */
public class A025471 extends A000961 {

  private long mN = 0;
  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(5);
    do {
      ++mN;
    } while (!super.next().equals(mA));
    return Z.valueOf(mN);
  }
}

