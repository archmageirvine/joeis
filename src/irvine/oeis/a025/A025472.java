package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.a000.A000961;

/**
 * A025472 <code>a(n)</code> is the position of <code>7^n</code> among the powers of primes <code>(A000961)</code>.
 * @author Sean A. Irvine
 */
public class A025472 extends A000961 {

  private long mN = 0;
  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(7);
    do {
      ++mN;
    } while (!super.next().equals(mA));
    return Z.valueOf(mN);
  }
}

