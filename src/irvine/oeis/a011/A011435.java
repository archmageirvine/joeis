package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011435 Decimal expansion of 16th root of 20.
 * @author Sean A. Irvine
 */
public class A011435 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011435() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(20), CR.valueOf(16).inverse()));
  }
}
