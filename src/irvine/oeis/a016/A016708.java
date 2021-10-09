package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A016708 Decimal expansion of log(85).
 * @author Sean A. Irvine
 */
public class A016708 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016708() {
    super(CR.valueOf(85).log());
  }
}
