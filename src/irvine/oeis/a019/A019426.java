package irvine.oeis.a019;

import irvine.oeis.a161.A161012;
import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A019426 Continued fraction for tan(1/3).
 * @author Sean A. Irvine
 */
public class A019426 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A019426() {
    super(0, new A161012());
  }
}
