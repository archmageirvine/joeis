package irvine.oeis.a327;
// Generated by gen_seq4.pl floor at 2021-08-31 21:27

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;

/**
 * A327310 a(n) = floor(3*n*r) - 3*floor(n*r), where r = sqrt(8).
 * @author Georg Fischer
 */
public class A327310 extends FloorSequence {

  private final CR mR = CR.EIGHT.sqrt();

  /** Construct the sequence. */
  public A327310() {
    super(0);
  }

  protected Z evalCR(final long n) {
    return CR.THREE.multiply(mR).multiply(CR.valueOf(n)).floor().subtract(Z.THREE.multiply(mR.multiply(CR.valueOf(n)).floor()));
  }

}
