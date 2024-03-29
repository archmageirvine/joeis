package irvine.oeis.a124;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-24 21:51

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A124239 a(n) = Sum_{k=1..n} Sum_{m=1..n} (2*k - 1)^m.
 * a(n) = sum(k=1,n,sum(m=1,n,(2*k - 1)^m));
 * @author Georg Fischer
 */
public class A124239 extends LambdaSequence {

  /** Construct the sequence. */
  public A124239() {
    super(1, n -> Integers.SINGLETON.sum(1, n, k -> Integers.SINGLETON.sum(1, n, m -> Z.valueOf(2L * k - 1).pow(m))));
  }
}
