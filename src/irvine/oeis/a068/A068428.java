package irvine.oeis.a068;
// generated by patch_offset.pl at 2022-08-17 15:41

import irvine.math.cr.Zeta;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A068428 Expansion of zeta(3) in base 2.
 * @author Georg Fischer
 */
public class A068428 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A068428() {
    super(1, Zeta.zeta(3), 2);
  }
}
