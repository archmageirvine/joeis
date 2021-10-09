package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A016662 Decimal expansion of log(39).
 * @author Sean A. Irvine
 */
public class A016662 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016662() {
    super(CR.valueOf(39).log());
  }
}
