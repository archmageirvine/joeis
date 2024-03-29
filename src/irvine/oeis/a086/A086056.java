package irvine.oeis.a086;
// generated by patch_offset.pl at 2022-08-17 15:41

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A086056 Decimal expansion of Pi/(2e).
 * @author Georg Fischer
 */
public class A086056 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A086056() {
    super(0, CR.PI.divide(CR.TWO.multiply(CR.E)));
  }
}
