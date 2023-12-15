package irvine.oeis.a067;

import irvine.oeis.InverseSequence;
import irvine.oeis.a084.A084143;

/**
 * A067376 Smallest integer expressible as the sum of (at least two) consecutive primes in n ways.
 * @author Sean A. Irvine
 */
public class A067376 extends InverseSequence {

  /** Construct the sequence. */
  public A067376() {
    super(1, new A084143());
  }
}
