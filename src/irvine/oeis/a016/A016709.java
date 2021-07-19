package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016709 Decimal expansion of log(86).
 * @author Sean A. Irvine
 */
public class A016709 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016709() {
    super(CR.valueOf(86).log());
  }
}
