package irvine.oeis.a391;

import irvine.oeis.DirectSequence;
import irvine.oeis.TwoParameterFormSequence;
import irvine.oeis.a001.A001597;

/**
 * A391195 Integers which can be expressed as the sum of two distinct perfect powers.
 * @author Sean A. Irvine
 */
public class A391195 extends TwoParameterFormSequence {

  private static final DirectSequence POWERS = DirectSequence.create(new A001597());

  /** Construct the sequence. */
  public A391195() {
    super(1, 0, 1, (x, y) -> x >= y ? null : POWERS.a(x.intValue()).add(POWERS.a(y.intValue())));
  }
}
