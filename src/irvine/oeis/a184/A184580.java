package irvine.oeis.a184;
// Generated by gen_seq4.pl floor at 2021-08-30 23:16

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;

/**
 * A184580 a(n) = floor((n-1/4)*sqrt(2)), complement of A184581.
 * @author Georg Fischer
 */
public class A184580 extends FloorSequence {
  /** Construct the sequence. */
  public A184580() {
    super(1);
  }

  protected Z evalCR(final long n) {
    return CR.valueOf(n).subtract(CR.ONE.divide(CR.FOUR)).multiply(CR.SQRT2).floor();
  }

}
