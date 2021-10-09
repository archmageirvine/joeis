package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011284 Decimal expansion of 15th root of 10.
 * @author Sean A. Irvine
 */
public class A011284 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011284() {
    super(ComputableReals.SINGLETON.pow(CR.TEN, CR.valueOf(15).inverse()));
  }
}
