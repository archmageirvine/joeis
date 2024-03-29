package irvine.oeis.a085;
// generated by patch_offset.pl at 2022-08-17 15:41

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A085676 Decimal expansion of -sin(10^50).
 * @author Georg Fischer
 */
public class A085676 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A085676() {
    super(0, CR.ZERO.subtract(REALS.pow(CR.TEN, CR.valueOf(50)).sin()));
  }
}
