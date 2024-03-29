package irvine.oeis.a252;
// Generated by gen_seq4.pl beatty2 at 2021-07-10 18:19

import irvine.math.cr.CR;
import irvine.oeis.cons.BeattySequence;

/**
 * A252169 Beatty sequence for sqrt(Pi*phi) where phi is the golden ratio A001622.
 * @author Georg Fischer
 */
public class A252169 extends BeattySequence {

  /** Construct the sequence. */
  public A252169() {
    super(1, CR.PI.multiply(CR.PHI).sqrt());
  }
}
