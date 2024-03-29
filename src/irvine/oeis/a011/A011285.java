package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011285 Decimal expansion of 16th root of 10.
 * @author Sean A. Irvine
 */
public class A011285 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011285() {
    super(ComputableReals.SINGLETON.pow(CR.TEN, CR.valueOf(16).inverse()));
  }
}
