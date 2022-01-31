package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000879;

/**
 * A054272 Number of primes in the interval [prime(n), prime(n)^2].
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A054272 implements Sequence {

  private final Sequence mA000879 = new A000879();
  private long mN = -1;

  @Override
  public Z next() {
    return mA000879.next().subtract(++mN);
  }
}
