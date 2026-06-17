package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000005;

/**
 * A059292 a(n) = n + 2 - (number of divisors of n).
 * @author Georg Fischer
 */
public class A059292 extends Sequence1 {

  private final Sequence mA000005 = new A000005();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).add(Z.TWO).subtract(mA000005.next());
  }
}
