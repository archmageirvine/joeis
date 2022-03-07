package irvine.oeis.a055;

import irvine.oeis.PositionSequence;
import irvine.oeis.a054.A054845;

/**
 * A055000 Integers that can be expressed as the sum of consecutive primes in exactly 5 ways.
 * @author Sean A. Irvine
 */
public class A055000 extends PositionSequence {

  /** Construct the sequence. */
  public A055000() {
    super(0, new A054845(), 5);
  }
}

