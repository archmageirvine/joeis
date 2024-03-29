package irvine.oeis.a182;
// Generated by gen_seq4.pl beatty2 at 2021-07-10 18:19

import irvine.math.cr.CR;
import irvine.oeis.cons.BeattySequence;

/**
 * A182769 Beatty sequence for (4 + sqrt(2))/2.
 * @author Georg Fischer
 */
public class A182769 extends BeattySequence {

  /** Construct the sequence. */
  public A182769() {
    super(1, CR.FOUR.add(CR.TWO.sqrt()).divide(CR.TWO));
  }
}
