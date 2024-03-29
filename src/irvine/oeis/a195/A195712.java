package irvine.oeis.a195;
// generated by patch_offset.pl at 2022-08-17 15:41

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A195712 Decimal expansion of arcsin((1/2)^(1/3)).
 * @author Georg Fischer
 */
public class A195712 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A195712() {
    super(0, REALS.asin(REALS.pow(CR.HALF, CR.ONE_THIRD)));
  }
}
