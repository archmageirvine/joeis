package irvine.oeis.a187;
// Generated by gen_seq4.pl beatty2 at 2021-07-10 18:19

import irvine.math.cr.CR;
import irvine.oeis.cons.BeattySequence;

/**
 * A187392 Floor(s*n), where s=1+sqrt(8)-sqrt(7); complement of A189391.
 * @author Georg Fischer
 */
public class A187392 extends BeattySequence {

  /** Construct the sequence. */
  public A187392() {
    super(1, CR.ONE.add(CR.EIGHT.sqrt()).subtract(CR.SEVEN.sqrt()));
  }
}
