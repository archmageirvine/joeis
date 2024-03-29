package irvine.oeis.a073;
// generated by patch_offset.pl at 2022-08-17 15:41

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A073745 Decimal expansion of csch(1).
 * @author Georg Fischer
 */
public class A073745 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A073745() {
    super(0, REALS.csch(CR.ONE));
  }
}
