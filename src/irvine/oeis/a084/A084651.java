package irvine.oeis.a084;

import irvine.math.cr.CR;
import irvine.oeis.EngelExpansionSequence;

/**
 * A084651 Engel expansion for cos(1).
 * @author Sean A. Irvine
 */
public class A084651 extends EngelExpansionSequence {

  /** Construct the sequence. */
  public A084651() {
    super(CR.ONE.cos());
  }
}
