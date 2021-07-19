package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016652 Decimal expansion of log(29).
 * @author Sean A. Irvine
 */
public class A016652 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016652() {
    super(CR.valueOf(29).log());
  }
}
