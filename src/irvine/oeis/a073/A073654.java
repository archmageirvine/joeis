package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000040;

/**
 * A073654 A073653 is defined to be 'rearrangement of odd primes such that sum of three consecutive terms is a prime'. This is the sequence of those primes whose relative position is not disturbed in this rearrangement.
 * @author Sean A. Irvine
 */
public class A073654 extends Sequence1 {

  private final Sequence mA = new A000040().skip();
  private final Sequence mB = new A073653();

  @Override
  public Z next() {
    while (true) {
      final Z p = mA.next();
      if (p.equals(mB.next())) {
        return p;
      }
    }
  }
}
