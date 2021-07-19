package irvine.oeis.a073;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A073447 Decimal expansion of csc(1).
 * @author Sean A. Irvine
 */
public class A073447 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A073447() {
    super(CR.ONE.sin().inverse());
  }
}
