package irvine.oeis.a073;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A073448 Decimal expansion of sec(1).
 * @author Sean A. Irvine
 */
public class A073448 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A073448() {
    super(CR.ONE.cos().inverse());
  }
}
