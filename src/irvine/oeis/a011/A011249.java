package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011249 Decimal expansion of 10th root of 8.
 * @author Sean A. Irvine
 */
public class A011249 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011249() {
    super(ComputableReals.SINGLETON.pow(CR.EIGHT, CR.TEN.inverse()));
  }
}
