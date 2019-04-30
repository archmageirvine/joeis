package irvine.oeis.a019;

import irvine.oeis.ContinuedFractionSequence;
import irvine.oeis.a161.A161012;

/**
 * A019426 Continued fraction for <code>tan(1/3)</code>.
 * @author Sean A. Irvine
 */
public class A019426 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A019426() {
    super(new A161012());
  }
}
