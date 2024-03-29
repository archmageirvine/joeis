package irvine.oeis.a187;
// Generated by gen_seq4.pl floor at 2021-08-28 23:11

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;
/**
 * A187394 a(n) = floor(s*n), where s = 4 - sqrt(8); complement of A187393.
 * @author Georg Fischer
 */
public class A187394 extends FloorSequence {

  private final CR mS = CR.FOUR.subtract(CR.TWO.multiply(CR.SQRT2));

  /** Construct the sequence. */
  public A187394() {
    super(1);
  }

  protected Z evalCR(final long n) {
    return mS.multiply(CR.valueOf(n)).floor();
  }

}
