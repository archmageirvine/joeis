package irvine.oeis.a068;
// generated by patch_offset.pl at 2022-08-17 15:41

import irvine.math.cr.Zeta;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A068430 Expansion of zeta(4) in base 2.
 * @author Georg Fischer
 */
public class A068430 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A068430() {
    super(1, Zeta.zeta(4), 2);
  }
}
