package irvine.oeis.a283;
// Generated by ./gen_seq4.pl /partsum at 2022-06-25 09:09

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a026.A026351;

/**
 * A283733 a(n) = a(n-1) + 1 + floor(n*golden ratio), with a(0) = 1.
 * @author Sean A. Irvine
 */
public class A283733 extends PartialSumSequence {

  /** Construct the sequence. */
  public A283733() {
    super(new A026351());
  }
}
