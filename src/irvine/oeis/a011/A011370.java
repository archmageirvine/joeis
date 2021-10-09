package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011370 Decimal expansion of 11th root of 16.
 * @author Sean A. Irvine
 */
public class A011370 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011370() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(16), CR.valueOf(11).inverse()));
  }
}
