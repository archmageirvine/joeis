package irvine.oeis.a356;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-24 21:51

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A356249 a(n) = Sum_{k=1..n} (k * floor(n/k))^3.
 * a(n) = sum(k=1,n,(k*(n\k))^3);
 * @author Georg Fischer
 */
public class A356249 extends LambdaSequence {

  /** Construct the sequence. */
  public A356249() {
    super(1, n -> Integers.SINGLETON.sum(1, n, k -> Z.valueOf(k).multiply(Z.valueOf(n / k)).pow(Z.THREE)));
  }
}
