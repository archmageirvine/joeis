package irvine.oeis.a059;
// manually (beatty2) at 2021-07-10

import irvine.oeis.BeattySequence;
import irvine.oeis.a073.A073006;

/**
 * A059553 Beatty sequence for Gamma(2/3).
 * @author Georg Fischer
 */
public class A059553 extends BeattySequence {

  /** Construct the sequence. */
  public A059553() {
    super(1, A073006.GAMMA_TWO_THIRDS);
  }
}
