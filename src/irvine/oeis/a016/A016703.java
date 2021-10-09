package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A016703 Decimal expansion of log(80).
 * @author Sean A. Irvine
 */
public class A016703 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016703() {
    super(CR.valueOf(80).log());
  }
}
