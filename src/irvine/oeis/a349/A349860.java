package irvine.oeis.a349;
// Generated by gen_seq4.pl 2024-04-24/lambdan at 2024-04-24 18:19

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A349860 Expansion of Sum_{k&gt;=0} k * x^k/(1 + k^3 * x).
 * @author Georg Fischer
 */
public class A349860 extends LambdaSequence {

  /** Construct the sequence. */
  public A349860() {
    super(0, n -> Integers.SINGLETON.sum(0, n, k -> Z.valueOf(k).pow(3).negate().pow(n - k).multiply(k)));
  }
}
