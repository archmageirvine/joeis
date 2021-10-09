package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011271 Decimal expansion of 17th root of 9.
 * @author Sean A. Irvine
 */
public class A011271 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011271() {
    super(ComputableReals.SINGLETON.pow(CR.NINE, CR.valueOf(17).inverse()));
  }
}
