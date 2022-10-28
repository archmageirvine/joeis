package irvine.oeis.a055;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a054.A054845;

/**
 * A055001 Integers that can be expressed as the sum of consecutive primes in exactly 6 ways.
 * @author Sean A. Irvine
 */
public class A055001 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A055001() {
    super(0, new A054845(), 6);
  }
}

