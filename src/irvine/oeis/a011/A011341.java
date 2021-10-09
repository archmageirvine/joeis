package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011341 Decimal expansion of 12th root of 14.
 * @author Sean A. Irvine
 */
public class A011341 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011341() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(14), CR.valueOf(12).inverse()));
  }
}
