package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A016717 Decimal expansion of log(94).
 * @author Sean A. Irvine
 */
public class A016717 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016717() {
    super(CR.valueOf(94).log());
  }
}
