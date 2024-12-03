package irvine.oeis.a378;

import irvine.oeis.a085.A085565;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A378013 Decimal expansion of A^2, where A is the lemniscate constant (A085565).
 * @author Sean A. Irvine
 */
public class A378013 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A378013() {
    super(1, new A085565().getCR().square());
  }
}
