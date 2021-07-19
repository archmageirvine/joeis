package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016629 Decimal expansion of log(6).
 * @author Sean A. Irvine
 */
public class A016629 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016629() {
    super(CR.SIX.log());
  }
}
