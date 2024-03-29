package irvine.oeis.a345;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-24 21:51

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A345176 a(n) = Sum_{k=1..n} floor(n/k)^k.
 * a(n) = sum(k=1,n,(n\k)^k);
 * @author Georg Fischer
 */
public class A345176 extends LambdaSequence {

  /** Construct the sequence. */
  public A345176() {
    super(1, n -> Integers.SINGLETON.sum(1, n, k -> Z.valueOf(n / k).pow(k)));
  }
}
