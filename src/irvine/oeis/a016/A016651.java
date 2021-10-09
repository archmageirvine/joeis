package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A016651 Decimal expansion of log(28).
 * @author Sean A. Irvine
 */
public class A016651 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016651() {
    super(CR.valueOf(28).log());
  }
}
