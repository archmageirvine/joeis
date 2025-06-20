package irvine.oeis.a383;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A383659 Decimal expansion of phi + 2*log(phi), where phi is the golden ratio.
 * @author Sean A. Irvine
 */
public class A383659 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A383659() {
    super(1, CR.PHI.add(CR.PHI.log().multiply(2)));
  }
}
