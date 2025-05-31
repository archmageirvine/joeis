package irvine.oeis.a384;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A384238 Decimal expansion of Integral_{x=0..1} 1/(1 + x/(1 + x/(1 + x/...))) dx.
 * @author Sean A. Irvine
 */
public class A384238 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A384238() {
    super(0, CR.FIVE.sqrt().subtract(CR.PHI.log()).subtract(CR.ONE));
  }
}
