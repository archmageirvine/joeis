package irvine.oeis.a122;
// Generated by gen_seq4.pl 2024-10-20.ack/multrar at 2024-10-20 00:12

import irvine.math.function.Functions;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A122263 a(n) = 2*a(n-1)-a(n-2)+2*(Prime[n+1]-Prime[n]).
 * @author Georg Fischer
 */
public class A122263 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A122263() {
    super(1, (self, n) -> self.a(n - 1).multiply(2).subtract(self.a(n - 2)).add(Functions.PRIME.z(n + 1).subtract(Functions.PRIME.z(n)).multiply(2)), "2,3");
  }
}
