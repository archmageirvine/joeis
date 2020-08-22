package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016514 Continued fraction for log(86).
 * @author Sean A. Irvine
 */
public class A016514 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016514() {
    super(new A016709());
  }
}
