package irvine.oeis.a364;
// Generated by gen_seq4.pl 2024-03-12/lambdan at 2024-03-12 20:32

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A364013 Expansion of Sum_{k&gt;0} k^2 * x^k / (1 + x^(3*k)).
 * @author Georg Fischer
 */
public class A364013 extends LambdaSequence {

  /** Construct the sequence. */
  public A364013() {
    super(1, n -> Integers.SINGLETON.sumdiv(n, d -> Z.valueOf(n / d % 3 == 1 ? 1 : 0).multiply(Z.NEG_ONE.pow(n / d)).multiply((long) d * d)).negate());
  }
}
