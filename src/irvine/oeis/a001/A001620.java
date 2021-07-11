package irvine.oeis.a001;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A001620 Decimal expansion of Euler's constant (or the Euler-Mascheroni constant), gamma.
 * @author Sean A. Irvine
 */
public class A001620 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A001620() {
    super(0, CR.GAMMA);
  }
}
