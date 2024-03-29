package irvine.oeis.a244;
// Generated by gen_seq4.pl manch4/insect2 at 2024-03-12 13:36

import irvine.oeis.IntersectionSequence;
import irvine.oeis.a014.A014076;
import irvine.oeis.a061.A061345;

/**
 * A244623 Odd prime powers that are not primes.
 * @author Georg Fischer
 */
public class A244623 extends IntersectionSequence {

  /** Construct the sequence. */
  public A244623() {
    super(new A061345(), new A014076());
  }
}
