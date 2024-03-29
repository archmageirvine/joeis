package irvine.oeis.a118;
// Generated by gen_seq4.pl piercex at 2020-11-22 22:05

import irvine.math.cr.CR;
import irvine.oeis.PierceExpansionSequence;

/**
 * A118242 Pierce expansion of 1/phi.
 * @author Georg Fischer
 */
public class A118242 extends PierceExpansionSequence {

  /** Construct the sequence. */
  public A118242() {
    super(1, 4096);
  }

  @Override
  protected CR getN() {
    return CR.PHI.inverse();
  }
}
