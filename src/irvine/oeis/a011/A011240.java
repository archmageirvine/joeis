package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011240 Decimal expansion of 16th root of 7.
 * @author Sean A. Irvine
 */
public class A011240 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011240() {
    super(ComputableReals.SINGLETON.pow(CR.SEVEN, CR.valueOf(16).inverse()));
  }
}
