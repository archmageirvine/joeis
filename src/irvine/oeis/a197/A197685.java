package irvine.oeis.a197;
// generated by patch_offset.pl at 2022-08-17 15:41

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A197685 Decimal expansion of Pi^2/(4 + 2*Pi).
 * @author Georg Fischer
 */
public class A197685 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A197685() {
    super(0, REALS.pow(CR.PI, CR.TWO).divide(CR.FOUR.add(CR.TAU)));
  }
}
