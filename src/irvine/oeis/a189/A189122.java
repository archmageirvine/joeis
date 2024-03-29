package irvine.oeis.a189;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-09-13 11:40

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A189122 a(n) = Sum_{i=0..n} (i+1)^2*n^i.
 * a(n) = sum(i=0,n,(i+1)^2*n^i)
 * @author Georg Fischer
 */
public class A189122 extends LambdaSequence {

  /** Construct the sequence. */
  public A189122() {
    super(0, n -> Integers.SINGLETON.sum(0, n, i -> Z.valueOf(i + 1).square().multiply(Z.valueOf(n).pow(i))));
  }
}
