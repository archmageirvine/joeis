package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A016718 Decimal expansion of log(95).
 * @author Sean A. Irvine
 */
public class A016718 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016718() {
    super(CR.valueOf(95).log());
  }
}
