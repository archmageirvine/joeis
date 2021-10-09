package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A016670 Decimal expansion of log(47).
 * @author Sean A. Irvine
 */
public class A016670 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016670() {
    super(CR.valueOf(47).log());
  }
}
