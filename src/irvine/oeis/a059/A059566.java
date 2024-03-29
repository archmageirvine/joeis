package irvine.oeis.a059;
// Generated by gen_seq4.pl beatty2r at 2021-07-10 18:19

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.BeattySequence;

/**
 * A059566 Beatty sequence for e^gamma/(e^gamma-1).
 * @author Georg Fischer
 */
public class A059566 extends BeattySequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A059566() {
    super(1, REALS.pow(CR.E, CR.GAMMA).divide(REALS.pow(CR.E, CR.GAMMA).subtract(CR.ONE)));
  }
}
