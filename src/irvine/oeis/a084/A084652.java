package irvine.oeis.a084;

import irvine.math.cr.CR;
import irvine.oeis.EngelExpansionSequence;

/**
 * A084652 Engel expansion for tan(1).
 * @author Sean A. Irvine
 */
public class A084652 extends EngelExpansionSequence {

  /** Construct the sequence. */
  public A084652() {
    super(CR.ONE.tan());
  }
}
