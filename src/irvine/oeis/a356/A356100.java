package irvine.oeis.a356;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-24 21:51

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A356100 a(n) = Sum_{k=1..n} (k - 1)^n * floor(n/k).
 * a(n) = sum(k=1,n,sumdiv(k,d,(d-1)^n));
 * @author Georg Fischer
 */
public class A356100 extends LambdaSequence {

  /** Construct the sequence. */
  public A356100() {
    super(1, n -> Integers.SINGLETON.sum(1, n, k -> Integers.SINGLETON.sumdiv(k, d -> Z.valueOf(d - 1).pow(n))));
  }
}
