package irvine.oeis.a033;

import irvine.oeis.RecordSequence;
import irvine.oeis.a030.A030168;

/**
 * A033310 Incrementally largest terms in continued fraction for <code>Copeland-Erd\u0151s</code> constant.
 * @author Sean A. Irvine
 */
public class A033310 extends RecordSequence {

  /** Construct the sequence. */
  public A033310() {
    super(new A030168());
  }
}
