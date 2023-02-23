package irvine.oeis.a098;
// manually rootet at 2023-02-21 21:45

import irvine.math.z.Z;
import irvine.oeis.SkipSequence;
import irvine.oeis.a010.A010051;
import irvine.oeis.transform.RootSequence;

/**
 * A098238 Number of ordered ways of writing n as sum of three primes.
 * @author Georg Fischer
 */
public class A098238 extends RootSequence {

  private int mN = -1;

  /** Construct the sequence. */
  public A098238() {
    super(0, new SkipSequence(new A010051(), 2), 3, 1);
  }

  @Override
  public Z next() {
    return (++mN <= 5) ? Z.ZERO : super.next();
  }
}
