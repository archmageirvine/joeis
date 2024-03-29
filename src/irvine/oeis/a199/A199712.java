package irvine.oeis.a199;
// generated by patch_offset.pl at 2022-08-17 15:41

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A199712 Decimal expansion of (2*Pi)^12.
 * @author Georg Fischer
 */
public class A199712 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A199712() {
    super(10, REALS.pow(CR.TAU, CR.valueOf(12)));
  }
}
