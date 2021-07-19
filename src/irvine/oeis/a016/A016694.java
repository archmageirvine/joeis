package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016694 Decimal expansion of log(71).
 * @author Sean A. Irvine
 */
public class A016694 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016694() {
    super(CR.valueOf(71).log());
  }
}
