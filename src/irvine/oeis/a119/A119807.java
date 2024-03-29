package irvine.oeis.a119;
// generated by patch_offset.pl at 2022-08-17 15:41

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A119807 Decimal expansion of sin(gamma).
 * @author Georg Fischer
 */
public class A119807 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A119807() {
    super(0, CR.GAMMA.sin());
  }
}
