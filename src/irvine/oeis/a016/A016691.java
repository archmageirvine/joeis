package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A016691 Decimal expansion of log(68).
 * @author Sean A. Irvine
 */
public class A016691 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016691() {
    super(CR.valueOf(68).log());
  }
}
