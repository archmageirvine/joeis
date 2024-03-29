package irvine.oeis.a244;
// generated by patch_offset.pl at 2022-08-17 15:41

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A244979 Decimal expansion of Pi/(2*sqrt(5)).
 * @author Georg Fischer
 */
public class A244979 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A244979() {
    super(0, CR.PI.divide(CR.TWO.multiply(CR.FIVE.sqrt())));
  }
}
