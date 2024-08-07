package irvine.oeis.a167;
// Generated by gen_seq4.pl 2024-08-02.ack/multrar at 2024-08-02 23:54

import irvine.math.function.Functions;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A167197 a(6) = 7, for n &gt;= 7, a(n) = a(n - 1) + gcd(n, a(n - 1)).
 * @author Georg Fischer
 */
public class A167197 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A167197() {
    super(6, (self, n) -> self.a(n - 1).add(Functions.GCD.z(n, self.a(n - 1))), "7");
  }
}
