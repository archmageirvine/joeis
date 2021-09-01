package irvine.oeis.a257;
// manually floorn at 2021-08-31

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.FloorSequence;

/**
 * A257853 a(n) = 2*n^3 - floor(2^(1/3)*n)^3.
 * @author Georg Fischer
 */
public class A257853 extends FloorSequence {

  /** Construct the sequence. */
  public A257853() {
    super(0);
  }

  protected Z evalCR(final long n) {
    return Z.valueOf(n).pow(3).multiply2().subtract(CR.valueOf(n).multiply(CR.TWO.pow(CR.ONE_THIRD)).floor().pow(3));
  }

}
