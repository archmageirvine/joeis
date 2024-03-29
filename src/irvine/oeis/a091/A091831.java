package irvine.oeis.a091;
// Generated by gen_seq4.pl piercex at 2020-11-22 22:05

import irvine.math.cr.CR;
import irvine.oeis.PierceExpansionSequence;

/**
 * A091831 Pierce expansion of 1/sqrt(2).
 * @author Georg Fischer
 */
public class A091831 extends PierceExpansionSequence {

  /** Construct the sequence. */
  public A091831() {
    super(0, 4096);
  }

  @Override
  protected CR getN() {
    return CR.TWO.sqrt().inverse();
  }
}
