package irvine.oeis.a359;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-24 21:51

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A359700 a(n) = Sum_{d|n} d^(d + n/d - 1).
 * a(n) = sumdiv(n,d,d^(d+n/d-1));
 * @author Georg Fischer
 */
public class A359700 extends LambdaSequence {

  /** Construct the sequence. */
  public A359700() {
    super(1, n -> Integers.SINGLETON.sumdiv(n, d -> Z.valueOf(d).pow(d + n / d - 1)));
  }
}
