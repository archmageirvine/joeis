package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016653 Decimal expansion of log(30).
 * @author Sean A. Irvine
 */
public class A016653 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016653() {
    super(CR.valueOf(30).log());
  }
}
