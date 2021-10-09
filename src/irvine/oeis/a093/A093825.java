package irvine.oeis.a093;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A093825 Decimal expansion of Pi/(3*sqrt(2)).
 * @author Sean A. Irvine
 */
public class A093825 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A093825() {
    super(CR.PI.divide(CR.valueOf(18).sqrt()));
  }
}
