package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A016648 Decimal expansion of log(25).
 * @author Sean A. Irvine
 */
public class A016648 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016648() {
    super(CR.valueOf(25).log());
  }
}
