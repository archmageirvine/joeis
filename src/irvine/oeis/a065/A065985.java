package irvine.oeis.a065;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a000.A000005;

/**
 * A065985 Numbers k such that d(k) / 2 is prime, where d(k) = number of divisors of k.
 * @author Sean A. Irvine
 */
public class A065985 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A065985() {
    super(1, 1, new A000005(), k -> k.isEven() && k.divide2().isProbablePrime());
  }
}
