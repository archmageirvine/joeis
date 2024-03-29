package irvine.oeis.a308;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-24 21:51

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A308688 a(n) = Sum_{d|n} d^(2*n/d - 1).
 * a(n) = sumdiv(n,d,d^(2*n/d-1))
 * @author Georg Fischer
 */
public class A308688 extends LambdaSequence {

  /** Construct the sequence. */
  public A308688() {
    super(1, n -> Integers.SINGLETON.sumdiv(n, d -> Z.valueOf(d).pow(2L * n / d - 1)));
  }
}
