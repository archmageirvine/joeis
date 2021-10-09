package irvine.oeis.a016;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A016532 Continued fraction for log(9/2).
 * @author Sean A. Irvine
 */
public class A016532 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016532() {
    super(new A016581());
  }
}
