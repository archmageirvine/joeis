package irvine.oeis.a294;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-24 21:51

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A294608 a(n) = Sum_{d|n} d^(d + 1 + n/d).
 * a(n) = sumdiv(n,d,d^(d+1+n/d))
 * @author Georg Fischer
 */
public class A294608 extends LambdaSequence {

  /** Construct the sequence. */
  public A294608() {
    super(1, n -> Integers.SINGLETON.sumdiv(n, d -> Z.valueOf(d).pow(d + 1 + n / d)));
  }
}
