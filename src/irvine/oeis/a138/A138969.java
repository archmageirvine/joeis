package irvine.oeis.a138;
// manually 2023-10-04/filtpos at 2023-10-04 07:12

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a000.A000040;

/**
 * A138969 Positions of the primes congruent to 2 mod 3 when all primes except 3 are listed in order.
 * @author Georg Fischer
 */
public class A138969 extends FilterPositionSequence {

  private int mN = 0;

  /** Construct the sequence. */
  public A138969() {
    super(1, 1, new A000040().skip(1), k -> k.mod(3) == 2 && k.isProbablePrime());
  }

  @Override
  public Z next() {
    return (++mN == 1) ? Z.ONE : super.next();
  }
}
