package irvine.oeis.a065;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a000.A000005;

/**
 * A065985 Numbers n such that d(n) / 2 is prime, where d(n) = number of divisors of n.
 * @author Sean A. Irvine
 */
public class A065985 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A065985() {
    super(1, 1, new A000005(), k -> k.isEven() && k.divide2().isProbablePrime());
  }
}
