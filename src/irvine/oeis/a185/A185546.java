package irvine.oeis.a185;
// Generated by gen_seq4.pl floor at 2021-08-28 23:11

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;
/**
 * A185546 a(n) = floor((1/2)*(n+1)^(3/2)); complement of A185547.
 * @author Georg Fischer
 */
public class A185546 extends FloorSequence {
  /** Construct the sequence. */
  public A185546() {
    super(1);
  }

  protected Z evalCR(final long n) {
    return CR.HALF.multiply(CR.valueOf(n).add(CR.ONE).pow(CR.THREE.divide(CR.TWO))).floor();
  }

}
