package irvine.oeis.a098;
// Generated by gen_seq4.pl 2024-04-10/lambdan at 2024-04-10 22:07

import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A098713 a(n) = (2n+1)*2^(2n+1) - 1.
 * @author Georg Fischer
 */
public class A098713 extends LambdaSequence {

  /** Construct the sequence. */
  public A098713() {
    super(0, n -> Z.valueOf(2L * n + 1).multiply(Z.TWO.pow(2L * n + 1)).subtract(1));
  }
}
