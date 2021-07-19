package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016636 Decimal expansion of log(13).
 * @author Sean A. Irvine
 */
public class A016636 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016636() {
    super(CR.valueOf(13).log());
  }
}
