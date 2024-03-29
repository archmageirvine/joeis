package irvine.oeis.a255;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-28 19:36

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A255344 Product_{k=1..n} k^(k^5).
 * a(n)=prod(k=1,n,k^(k^5))
 * @author Georg Fischer
 */
public class A255344 extends LambdaSequence {

  /** Construct the sequence. */
  public A255344() {
    super(1, n -> Integers.SINGLETON.product(1, n, k -> Z.valueOf(k).pow(Z.valueOf(k).pow(5))));
  }
}
