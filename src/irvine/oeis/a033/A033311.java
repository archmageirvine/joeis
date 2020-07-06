package irvine.oeis.a033;

import irvine.oeis.RecordPositionSequence;
import irvine.oeis.a030.A030168;

/**
 * A033311 Positions of incrementally largest terms in continued fraction for <code>Copeland-Erd\u0151s</code> constant.
 * @author Sean A. Irvine
 */
public class A033311 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A033311() {
    super(new A030168(), 1);
  }
}
