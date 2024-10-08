package irvine.oeis.a072;

import irvine.oeis.InverseSequence;
import irvine.oeis.a061.A061357;

/**
 * A072511 Least number m such that 2m can be expressed as the sum of two distinct primes in exactly n ways.
 * @author Sean A. Irvine
 */
public class A072511 extends InverseSequence {

  /** Construct the sequence. */
  public A072511() {
    super(0, new A061357(), 0);
  }
}
