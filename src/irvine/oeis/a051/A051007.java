package irvine.oeis.a051;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A051007 Continued fraction for prime constant A051006.
 * @author Sean A. Irvine
 */
public class A051007 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A051007() {
    super(0, new A051006());
  }
}

