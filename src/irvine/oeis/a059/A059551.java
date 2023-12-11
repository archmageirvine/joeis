package irvine.oeis.a059;
// manually (beatty2) at 2021-07-10

import irvine.oeis.a073.A073005;
import irvine.oeis.cons.BeattySequence;

/**
 * A059551 Beatty sequence for Gamma(1/3).
 * @author Georg Fischer
 */
public class A059551 extends BeattySequence {

  /** Construct the sequence. */
  public A059551() {
    super(1, A073005.GAMMA_THIRD);
  }
}
