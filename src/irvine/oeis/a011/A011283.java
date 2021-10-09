package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011283 Decimal expansion of 14th root of 10.
 * @author Sean A. Irvine
 */
public class A011283 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011283() {
    super(ComputableReals.SINGLETON.pow(CR.TEN, CR.valueOf(14).inverse()));
  }
}
