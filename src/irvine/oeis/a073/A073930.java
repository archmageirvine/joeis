package irvine.oeis.a073;

import irvine.oeis.FixedPointPositionSequence;
import irvine.oeis.a066.A066417;

/**
 * A073930 Numbers that are equal to the sum of their anti-divisors.
 * @author Sean A. Irvine
 */
public class A073930 extends FixedPointPositionSequence {

  /** Construct the sequence. */
  public A073930() {
    super(1, new A066417());
  }
}

