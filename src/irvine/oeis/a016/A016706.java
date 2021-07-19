package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016706 Decimal expansion of log(83).
 * @author Sean A. Irvine
 */
public class A016706 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016706() {
    super(CR.valueOf(83).log());
  }
}
