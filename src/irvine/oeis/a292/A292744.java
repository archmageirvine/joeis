package irvine.oeis.a292;
// Generated by gen_seq4.pl 2024-07-16/multrar at 2024-07-16 22:37

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A292744 a(0) = 1; a(n) = Sum_{k=1..n} prime(k+1)*a(n-k).
 * @author Georg Fischer
 */
public class A292744 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A292744() {
    super(0, (self, n) -> Integers.SINGLETON.sum(1, n, k -> self.a(n - k).multiply(Functions.PRIME.z(k + 1))), "1");
  }
}
