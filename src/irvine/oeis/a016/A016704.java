package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016704 Decimal expansion of log(81).
 * @author Sean A. Irvine
 */
public class A016704 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016704() {
    super(CR.valueOf(81).log());
  }
}
