package irvine.oeis.a262;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-09-13 11:40

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A262009 Sum_{d|n} 2^(d^2) * n^2/d^2.
 * a(n) = sumdiv(n,d,2^(n^2/d^2) * d^2)
 * @author Georg Fischer
 */
public class A262009 extends LambdaSequence {

  /** Construct the sequence. */
  public A262009() {
    super(1, n -> Integers.SINGLETON.sumdiv(n, d -> Z.TWO.pow((long) n * n / ((long) d * d)).multiply((long) d * d)));
  }
}
