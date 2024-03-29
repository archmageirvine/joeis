package irvine.oeis.a059;
// Generated by gen_seq4.pl beatty2 at 2021-07-10 18:19

import irvine.math.cr.CR;
import irvine.oeis.cons.BeattySequence;

/**
 * A059561 Beatty sequence for log(Pi).
 * @author Georg Fischer
 */
public class A059561 extends BeattySequence {

  /** Construct the sequence. */
  public A059561() {
    super(1, CR.PI.log());
  }
}
