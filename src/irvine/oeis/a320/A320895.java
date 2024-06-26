package irvine.oeis.a320;
// Generated by gen_seq4.pl 2024-03-12/lambdan at 2024-03-12 20:32

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A320895 a(n) = Sum_{k=1..n} k^3 * tau(k), where tau is A000005.
 * @author Georg Fischer
 */
public class A320895 extends LambdaSequence {

  /** Construct the sequence. */
  public A320895() {
    super(1, n -> Integers.SINGLETON.sum(1, n, k -> Z.valueOf(k).pow(3).multiply(Functions.SIGMA0.z(k))));
  }
}
