package irvine.oeis.a257;
// manually floorn at 2024-08-27

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;

/**
 * A257855 a(n) = 2*n^5 - floor(2^(1/5)*n)^5.
 * @author Georg Fischer
 */
public class A257855 extends FloorSequence {

  /** Construct the sequence. */
  public A257855() {
    super(0);
  }

  protected Z evalCR(final long n) {
    return Z.valueOf(n).pow(5).multiply2().subtract(CR.valueOf(n).multiply(CR.TWO.pow(CR.ONE.divide(CR.FIVE))).floor().pow(5));
  }

}
