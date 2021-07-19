package irvine.oeis.a098;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A098317 Decimal expansion of phi^3 = 2 + sqrt(5).
 * @author Sean A. Irvine
 */
public class A098317 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A098317() {
    super(CR.TWO.add(CR.FIVE.sqrt()));
  }
}
