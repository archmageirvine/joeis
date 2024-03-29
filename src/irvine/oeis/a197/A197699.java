package irvine.oeis.a197;
// generated by patch_offset.pl at 2022-08-17 15:41

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A197699 Decimal expansion of Pi/(6 + Pi).
 * @author Georg Fischer
 */
public class A197699 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A197699() {
    super(0, CR.PI.divide(CR.SIX.add(CR.PI)));
  }
}
