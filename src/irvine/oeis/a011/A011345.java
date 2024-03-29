package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011345 Decimal expansion of 16th root of 14.
 * @author Sean A. Irvine
 */
public class A011345 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011345() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(14), CR.valueOf(16).inverse()));
  }
}
