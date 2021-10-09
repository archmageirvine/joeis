package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A016687 Decimal expansion of log(64).
 * @author Sean A. Irvine
 */
public class A016687 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016687() {
    super(CR.valueOf(64).log());
  }
}
