package irvine.oeis.a359;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-24 21:51

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A359796 a(n) = Sum_{d|n} (2*d)^(d-1).
 * a(n) = sumdiv(n,d,(2*d)^(d-1));
 * @author Georg Fischer
 */
public class A359796 extends LambdaSequence {

  /** Construct the sequence. */
  public A359796() {
    super(1, n -> Integers.SINGLETON.sumdiv(n, d -> Z.valueOf(2L * d).pow(d - 1)));
  }
}
