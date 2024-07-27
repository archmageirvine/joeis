package irvine.oeis.a215;

import irvine.oeis.a114.A114490;
import irvine.oeis.cons.ContinuedFractionNumeratorSequence;

/**
 * A215757 Numerators of the continued fraction convergents of log_10(3).
 * @author Georg Fischer
 */
public class A215757 extends ContinuedFractionNumeratorSequence {

  /** Construct the sequence */
  public A215757() {
    super(0, new A114490());
  }
}
