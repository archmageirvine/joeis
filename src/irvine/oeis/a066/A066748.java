package irvine.oeis.a066;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A066748 The continued fraction for the "binary" Copeland-Erd\u0151s constant.
 * @author Sean A. Irvine
 */
public class A066748 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A066748() {
    super(0, new A066747());
  }
}

