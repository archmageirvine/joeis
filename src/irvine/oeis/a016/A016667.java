package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A016667 Decimal expansion of log(44).
 * @author Sean A. Irvine
 */
public class A016667 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016667() {
    super(CR.valueOf(44).log());
  }
}
