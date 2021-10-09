package irvine.oeis.a007;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A007525 Decimal expansion of log_2 e.
 * @author Sean A. Irvine
 */
public class A007525 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A007525() {
    super(CR.TWO.log().inverse());
  }
}
