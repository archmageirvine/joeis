package irvine.oeis.a252;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-28 19:36

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A252708 Sum_{k=0..n} k^(n+k)*(n+k)^k.
 * a(n)=sum(k=0,n,k^(n+k)*(n+k)^k)
 * @author Georg Fischer
 */
public class A252708 extends LambdaSequence {

  /** Construct the sequence. */
  public A252708() {
    super(1, n -> Integers.SINGLETON.sum(0, n, k -> Z.valueOf(k).pow(n + k).multiply(Z.valueOf(n + k).pow(k))));
  }
}
