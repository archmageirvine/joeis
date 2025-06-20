package irvine.oeis.a097;
// Generated by gen_seq4.pl 2025-05-29.ack/lambdan at 2025-05-29 22:38

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.oeis.LambdaSequence;

/**
 * A097541 Sum_{k=1..n-1} J(2*n,k)*k, where J(i,j) is the Jacobi symbol.
 * @author Georg Fischer
 */
public class A097541 extends LambdaSequence {

  /** Construct the sequence. */
  public A097541() {
    super(1, n -> Integers.SINGLETON.sum(1, n - 1, k -> Functions.JACOBI.z(2L * n, k).multiply(k)));
  }
}
