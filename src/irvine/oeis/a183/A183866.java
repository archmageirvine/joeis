package irvine.oeis.a183;
// Generated by gen_seq4.pl floor at 2021-08-30 23:16

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;

/**
 * A183866 n+floor(2*sqrt(n-1)); complement of A035106.
 * @author Georg Fischer
 */
public class A183866 extends FloorSequence {
  /** Construct the sequence. */
  public A183866() {
    super(1);
  }

  protected Z evalCR(final long n) {
    return Z.valueOf(n).add(CR.TWO.multiply(CR.valueOf(n).subtract(CR.ONE).sqrt()).floor());
  }

}
