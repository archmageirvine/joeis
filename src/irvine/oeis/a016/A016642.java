package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016642 Decimal expansion of log(19).
 * @author Sean A. Irvine
 */
public class A016642 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016642() {
    super(CR.valueOf(19).log());
  }
}
