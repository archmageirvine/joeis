package irvine.oeis.a093;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-26 21:16

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.oeis.LambdaSequence;

/**
 * A093002 Product of factorials of next n numbers.
 * a(n)=prod(i=n+1,2*n,i!)
 * @author Georg Fischer
 */
public class A093002 extends LambdaSequence {

  /** Construct the sequence. */
  public A093002() {
    super(1, n -> Integers.SINGLETON.product(n, 2 * n - 2, i -> Functions.FACTORIAL.z(i)));
  }
}
