package irvine.oeis.a137;
// Generated by gen_seq4.pl beatty2 at 2021-07-10 18:19

import irvine.math.cr.CR;
import irvine.oeis.cons.BeattySequence;

/**
 * A137804 a(n) = floor(n*(4*sqrt(2)+9)/7).
 * @author Georg Fischer
 */
public class A137804 extends BeattySequence {

  /** Construct the sequence. */
  public A137804() {
    super(1, CR.FOUR.multiply(CR.TWO.sqrt()).add(CR.NINE).divide(CR.SEVEN));
  }
}
