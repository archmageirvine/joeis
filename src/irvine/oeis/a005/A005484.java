package irvine.oeis.a005;

import irvine.oeis.ContinuedFractionNumeratorSequence;

/**
 * A005484 Numerators of convergents to cube root of 7.
 * @author Sean A. Irvine
 */
public class A005484 extends ContinuedFractionNumeratorSequence {

  /** Construct the sequence. */
  public A005484() {
    super(new A005482());
  }
}
