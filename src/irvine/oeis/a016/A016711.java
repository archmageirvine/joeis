package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016711 Decimal expansion of log(88).
 * @author Sean A. Irvine
 */
public class A016711 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016711() {
    super(CR.valueOf(88).log());
  }
}
