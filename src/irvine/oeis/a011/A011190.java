package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011190 Decimal expansion of 11th root of 4.
 * @author Sean A. Irvine
 */
public class A011190 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011190() {
    super(ComputableReals.SINGLETON.pow(CR.FOUR, CR.valueOf(11).inverse()));
  }
}
