package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A016638 Decimal expansion of log(15).
 * @author Sean A. Irvine
 */
public class A016638 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016638() {
    super(CR.valueOf(15).log());
  }
}
