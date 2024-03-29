package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011244 Decimal expansion of 20th root of 7.
 * @author Sean A. Irvine
 */
public class A011244 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011244() {
    super(ComputableReals.SINGLETON.pow(CR.SEVEN, CR.valueOf(20).inverse()));
  }
}
