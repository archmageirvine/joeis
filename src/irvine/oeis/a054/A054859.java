package irvine.oeis.a054;

import irvine.oeis.InverseSequence;
import irvine.oeis.SkipSequence;

/**
 * A054859 Smallest positive integer that can be expressed as the sum of consecutive primes in exactly n ways.
 * @author Sean A. Irvine
 */
public class A054859 extends InverseSequence {

  /** Construct the sequence. */
  public A054859() {
    super(new SkipSequence(new A054845(), 1), 0);
  }
}
