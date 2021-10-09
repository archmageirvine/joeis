package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A016660 Decimal expansion of log(37).
 * @author Sean A. Irvine
 */
public class A016660 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016660() {
    super(CR.valueOf(37).log());
  }
}
