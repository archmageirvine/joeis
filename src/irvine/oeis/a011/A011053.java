package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011053 Decimal expansion of 4th root of 60.
 * @author Sean A. Irvine
 */
public class A011053 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011053() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(60), CR.FOUR.inverse()));
  }
}
