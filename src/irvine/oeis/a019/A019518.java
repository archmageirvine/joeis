package irvine.oeis.a019;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A019518 Smarandache-Wellin numbers: <code>a(n) =</code> concatenation of first n primes (written in base 10).
 * @author Sean A. Irvine
 */
public class A019518 extends A000040 {

  private final StringBuilder mA = new StringBuilder();

  @Override
  public Z next() {
    mA.append(super.next());
    return new Z(mA);
  }
}

