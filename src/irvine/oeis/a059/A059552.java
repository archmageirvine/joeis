package irvine.oeis.a059;
// manually (beatty2) at 2021-07-10

import irvine.math.cr.CR;
import irvine.oeis.BeattySequence;
import irvine.oeis.a073.A073005;

/**
 * A059552 Beatty sequence for Gamma(1/3)/(Gamma(1/3)-1).
 * @author Georg Fischer
 */
public class A059552 extends BeattySequence {

  /** Construct the sequence */
  public A059552() {
    super(1, A073005.GAMMA_THIRD.divide(A073005.GAMMA_THIRD.subtract(CR.ONE)));
  }
}
