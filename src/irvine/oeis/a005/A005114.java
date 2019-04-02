package irvine.oeis.a005;

import irvine.oeis.ComplementSequence;
import irvine.oeis.a078.A078923;

/**
 * A005114 Untouchable numbers, also called nonaliquot numbers: impossible values for sum of aliquot parts of n (A001065).
 * @author Sean A. Irvine
 */
public class A005114 extends ComplementSequence {

  /** Construct the sequence. */
  public A005114() {
    super(new A078923());
  }
}
