package irvine.oeis.a383;
// Generated by gen_seq4.pl 2025-05-24.ack/lambdan at 2025-05-24 23:04

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A383869 a(n) = [x^n] 1/Product_{k=0..n} (1 - (n+k)*x).
 * @author Georg Fischer
 */
public class A383869 extends LambdaSequence {

  /** Construct the sequence. */
  public A383869() {
    super(0, n -> Integers.SINGLETON.sum(0, n, k -> Z.NEG_ONE.pow(n - k).multiply(Z.valueOf(n + k).pow(2 * n)).multiply(Binomial.binomial(n, k))).divide(Functions.FACTORIAL.z(n)));
  }
}
