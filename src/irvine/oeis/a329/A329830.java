package irvine.oeis.a329;
// Generated by gen_seq4.pl beatty2 at 2021-07-10 18:19

import irvine.math.cr.CR;
import irvine.oeis.cons.BeattySequence;

/**
 * A329830 Beatty sequence for (4+sqrt(10))/3.
 * @author Georg Fischer
 */
public class A329830 extends BeattySequence {

  /** Construct the sequence. */
  public A329830() {
    super(1, CR.FOUR.add(CR.TEN.sqrt()).divide(CR.THREE));
  }
}
