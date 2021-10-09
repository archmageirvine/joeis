package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A016700 Decimal expansion of log(77).
 * @author Sean A. Irvine
 */
public class A016700 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016700() {
    super(CR.valueOf(77).log());
  }
}
