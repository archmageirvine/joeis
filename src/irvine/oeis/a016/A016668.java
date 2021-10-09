package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A016668 Decimal expansion of log(45).
 * @author Sean A. Irvine
 */
public class A016668 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016668() {
    super(CR.valueOf(45).log());
  }
}
