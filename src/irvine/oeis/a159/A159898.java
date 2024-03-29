package irvine.oeis.a159;
// Generated by gen_seq4.pl dexcr CR.valueOf(1760979).add(CR.valueOf(1141390).multiply(CR.SQRT2)).divide(REALS.pow(CR.valueOf(839), CR.TWO)) true 10 at 2020-04-05 12:17
// DO NOT EDIT here!

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A159898 Decimal expansion of (1760979+1141390*sqrt(2))/839^2.
 * @author Georg Fischer
 */
public class A159898 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A159898() {
    super(CR.valueOf(1760979).add(CR.valueOf(1141390).multiply(CR.SQRT2)).divide(REALS.pow(CR.valueOf(839), CR.TWO)));
  }
}
