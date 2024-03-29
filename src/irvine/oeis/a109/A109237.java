package irvine.oeis.a109;
// Generated by gen_seq4.pl beatty2r at 2021-07-10 18:19

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.BeattySequence;

/**
 * A109237 a(n) = floor(n*coth(1)).
 * @author Georg Fischer
 */
public class A109237 extends BeattySequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A109237() {
    super(1, REALS.coth(CR.ONE));
  }
}
