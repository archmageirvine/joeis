package irvine.oeis.a054;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.a002.A002961;

/**
 * A054001 Differences between numbers k such that k and k+1 have the same sum of divisors.
 * @author Sean A. Irvine
 */
public class A054001 extends DifferenceSequence {

  /** Construct the sequence. */
  public A054001() {
    super(new A002961());
  }
}

