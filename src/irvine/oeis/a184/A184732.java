package irvine.oeis.a184;
// Generated by gen_seq4.pl floor at 2021-08-23 22:16

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;
/**
 * A184732 a(n) = floor(n*r+h), where r=(1+sqrt(5))/2, h=-1/4; complement of A184733.
 * @author Georg Fischer
 */
public class A184732 extends FloorSequence {
  /** Construct the sequence. */
  public A184732() {
    super(1);
  }

  protected Z evalCR(final long n) {
    return CR.valueOf(n).multiply(CR.PHI).add(CR.THREE.divide(CR.FOUR)).floor().subtract(Z.ONE);
  }

}
