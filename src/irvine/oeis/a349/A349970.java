package irvine.oeis.a349;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-24 21:51

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A349970 a(n) = Sum_{k=0..n} (2*k)^(n-k).
 * a(n) = sum(k=0,n,(2*k)^(n-k));
 * @author Georg Fischer
 */
public class A349970 extends LambdaSequence {

  /** Construct the sequence. */
  public A349970() {
    super(0, n -> Integers.SINGLETON.sum(0, n, k -> Z.valueOf(2L * k).pow(n - k)));
  }
}
