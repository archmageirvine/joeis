package irvine.oeis.a187;
// Generated by gen_seq4.pl beatty2 at 2021-07-10 18:19

import irvine.math.cr.CR;
import irvine.oeis.cons.BeattySequence;

/**
 * A187391 Floor(r*n), where r=1+sqrt(8)+sqrt(7); complement of A187392.
 * @author Georg Fischer
 */
public class A187391 extends BeattySequence {

  /** Construct the sequence. */
  public A187391() {
    super(1, CR.ONE.add(CR.EIGHT.sqrt()).add(CR.SEVEN.sqrt()));
  }
}
