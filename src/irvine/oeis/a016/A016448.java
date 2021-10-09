package irvine.oeis.a016;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A016448 Continued fraction for log(20).
 * @author Sean A. Irvine
 */
public class A016448 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016448() {
    super(new A016643());
  }
}
