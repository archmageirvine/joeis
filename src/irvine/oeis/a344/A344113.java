package irvine.oeis.a344;
// Generated by gen_seq4.pl 2024-04-10/lambdan at 2024-04-10 22:07

import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A344113 a(n) = 2^(n^2) - n^n.
 * @author Georg Fischer
 */
public class A344113 extends LambdaSequence {

  /** Construct the sequence. */
  public A344113() {
    super(1, n -> Z.TWO.pow((long) n * n).subtract(Z.valueOf(n).pow(n)));
  }
}
