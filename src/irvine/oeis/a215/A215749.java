package irvine.oeis.a215;

import irvine.oeis.PrependSequence;
import irvine.oeis.a152.A152566;
import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A215749 Continued fraction expansion of log_10(3).
 * @author Georg Fischer
 */
public class A215749 extends PrependSequence {

  /** Construct the sequence. */
  public A215749() {
    super(0, new ContinuedFractionSequence(new A152566()), 0);
  }
}
