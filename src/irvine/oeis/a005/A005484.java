package irvine.oeis.a005;

import irvine.oeis.cons.ContinuedFractionNumeratorSequence;

/**
 * A005484 Numerators of continued fraction convergents to cube root of 7.
 * @author Sean A. Irvine
 */
public class A005484 extends ContinuedFractionNumeratorSequence {

  /** Construct the sequence. */
  public A005484() {
    super(0, new A005482());
  }
}
