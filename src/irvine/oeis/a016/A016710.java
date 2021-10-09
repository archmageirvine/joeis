package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A016710 Decimal expansion of log(87).
 * @author Sean A. Irvine
 */
public class A016710 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016710() {
    super(CR.valueOf(87).log());
  }
}
