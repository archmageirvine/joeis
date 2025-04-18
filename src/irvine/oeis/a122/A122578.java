package irvine.oeis.a122;
// Generated by gen_seq4.pl 2024-10-20.ack/multrar at 2024-10-20 00:12

import irvine.oeis.transform.MultiTransformSequence;

/**
 * A122578 a(0)=1, a(1)=2 continued recursively a(n) = (n-1)*a(n-1) - a(n-2) if n is even and a(n) = a(n-1) - (n-2)*a(n-2) if n is odd.
 * @author Georg Fischer
 */
public class A122578 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A122578() {
    super(0, (self, n) -> ((n & 1) == 0) ? self.a(n - 1).multiply(n - 1).subtract(self.a(n - 2)) : self.a(n - 1).subtract(self.a(n - 2).multiply(n - 2)), "1,2");
  }
}
