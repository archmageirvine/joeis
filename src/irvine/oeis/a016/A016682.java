package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A016682 Decimal expansion of log(59).
 * @author Sean A. Irvine
 */
public class A016682 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016682() {
    super(CR.valueOf(59).log());
  }
}
