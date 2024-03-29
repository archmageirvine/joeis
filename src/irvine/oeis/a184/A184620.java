package irvine.oeis.a184;
// Generated by gen_seq4.pl floor at 2021-08-23 22:16

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;
/**
 * A184620 a(n) = floor(nr+h), where r=sqrt(2), h=1/4; complement of A184621.
 * @author Georg Fischer
 */
public class A184620 extends FloorSequence {
  /** Construct the sequence. */
  public A184620() {
    super(1);
  }

  protected Z evalCR(final long n) {
    return CR.valueOf(n).multiply(CR.SQRT2).add(CR.ONE.divide(CR.FOUR)).floor();
  }

}
