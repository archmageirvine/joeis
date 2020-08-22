package irvine.oeis.a006;

import irvine.oeis.ContinuedFractionSequence;
import irvine.oeis.a019.A019740;

/**
 * A006084 Continued fraction for e/3.
 * @author Sean A. Irvine
 */
public class A006084 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A006084() {
    super(new A019740());
  }
}
