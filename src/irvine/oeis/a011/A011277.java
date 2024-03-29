package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011277 Decimal expansion of 8th root of 10.
 * @author Sean A. Irvine
 */
public class A011277 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011277() {
    super(ComputableReals.SINGLETON.pow(CR.TEN, CR.EIGHT.inverse()));
  }
}
