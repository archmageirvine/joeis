package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A016707 Decimal expansion of log(84).
 * @author Sean A. Irvine
 */
public class A016707 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016707() {
    super(CR.valueOf(84).log());
  }
}
