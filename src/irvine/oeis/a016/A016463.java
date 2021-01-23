package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016463 Continued fraction for log(35).
 * @author Sean A. Irvine
 */
public class A016463 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016463() {
    super(new A016658());
  }
}
