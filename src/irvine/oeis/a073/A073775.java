package irvine.oeis.a073;
// Generated by gen_seq4.pl 2024-01-15/lambdan at 2024-01-17 19:19

import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A073775 Polynomial (1/3)*n^3 + (9/2)*n^2 + (85/6)*n - 2.
 * @author Georg Fischer
 */
public class A073775 extends LambdaSequence {

  /** Construct the sequence. */
  public A073775() {
    super(0, n -> Z.valueOf(n).pow(3).multiply(2).add(Z.valueOf(n).square().multiply(27)).add(Z.valueOf(n).multiply(85)).divide(6).subtract(2));
  }
}
