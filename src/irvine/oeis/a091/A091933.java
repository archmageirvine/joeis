package irvine.oeis.a091;
// generated by patch_offset.pl at 2022-08-17 15:41

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A091933 Decimal expansion of e^3.
 * @author Georg Fischer
 */
public class A091933 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A091933() {
    super(2, REALS.pow(CR.E, CR.THREE));
  }
}
