package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A016634 Decimal expansion of log(11).
 * @author Sean A. Irvine
 */
public class A016634 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016634() {
    super(CR.valueOf(11).log());
  }
}
