package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011238 Decimal expansion of 14th root of 7.
 * @author Sean A. Irvine
 */
public class A011238 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011238() {
    super(ComputableReals.SINGLETON.pow(CR.SEVEN, CR.valueOf(14).inverse()));
  }
}
