package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016693 Decimal expansion of log(70).
 * @author Sean A. Irvine
 */
public class A016693 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016693() {
    super(CR.valueOf(70).log());
  }
}
