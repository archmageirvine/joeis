package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016463 Continued fraction for <code>log(35)</code>.
 * @author Sean A. Irvine
 */
public class A016463 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016463() {
    super(new A016658());
  }
}
