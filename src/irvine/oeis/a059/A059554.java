package irvine.oeis.a059;
// manually (beatty2) at 2021-07-10

import irvine.math.cr.CR;
import irvine.oeis.BeattySequence;
import irvine.oeis.a073.A073006;

/**
 * A059554 Beatty sequence for Gamma(2/3)/(Gamma(2/3)-1).
 * @author Georg Fischer
 */
public class A059554 extends BeattySequence {

  /** Construct the sequence */
  public A059554() {
    super(1, A073006.GAMMA_TWO_THIRDS.divide(A073006.GAMMA_TWO_THIRDS.subtract(CR.ONE)));
  }
}
