package irvine.oeis.a228;
// Generated by gen_seq4.pl 2024-11-05.ack/lambdan at 2024-11-05 20:37

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.oeis.LambdaSequence;

/**
 * A228131 a(n) = Sum_{i=0..n-1} K(i,n)*i, where K(,) is Kronecker symbol.
 * @author Georg Fischer
 */
public class A228131 extends LambdaSequence {

  /** Construct the sequence. */
  public A228131() {
    super(1, n -> Integers.SINGLETON.sum(0, n - 1, i -> Functions.KRONECKER.z(i, n).multiply(i)));
  }
}
