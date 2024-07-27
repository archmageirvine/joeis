package irvine.oeis.a215;

import irvine.oeis.PrependSequence;
import irvine.oeis.a154.A154157;
import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A215750 Continued fraction expansion for log_10(6).
 * @author Georg Fischer
 */
public class A215750 extends PrependSequence {

  /** Construct the sequence. */
  public A215750() {
    super(0, new ContinuedFractionSequence(new A154157()), 0);
  }
}
