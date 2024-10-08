package irvine.oeis.a072;
// Generated by gen_seq4.pl 2024-08-26.ack/multrar at 2024-08-26 22:41

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A072979 a(n) = Sum_{k=1..n-1} gcd(k,n)*a(k), a(1) = 1.
 * @author Georg Fischer
 */
public class A072979 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A072979() {
    super(1, (self, n) -> Integers.SINGLETON.sum(1, n - 1, k -> self.a(k).multiply(Functions.GCD.z(k, n))), "1");
  }
}
