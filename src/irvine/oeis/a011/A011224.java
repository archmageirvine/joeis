package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011224 Decimal expansion of 15th root of 6.
 * @author Sean A. Irvine
 */
public class A011224 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011224() {
    super(ComputableReals.SINGLETON.pow(CR.SIX, CR.valueOf(15).inverse()));
  }
}
