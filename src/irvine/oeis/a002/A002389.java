package irvine.oeis.a002;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A002389 Decimal expansion of -log(gamma), where gamma is Euler's constant A001620.
 * @author Sean A. Irvine
 */
public class A002389 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A002389() {
    super(0, CR.GAMMA.log().negate());
  }
}
