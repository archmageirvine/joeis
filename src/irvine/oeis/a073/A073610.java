package irvine.oeis.a073;
// manually rootet at 2023-02-20 10:45

import irvine.math.z.Z;
import irvine.oeis.SkipSequence;
import irvine.oeis.a010.A010051;
import irvine.oeis.transform.RootSequence;

/**
 * A073610 Number of primes of the form n-p where p is a prime.
 * @author Georg Fischer
 */
public class A073610 extends RootSequence {

  private int mN = 0;

  /** Construct the sequence. */
  public A073610() {
    super(1, new SkipSequence(new A010051(), 2), 2, 1);
  }

  @Override
  public Z next() {
    return (++mN <= 3) ? Z.ZERO : super.next();
  }
}
