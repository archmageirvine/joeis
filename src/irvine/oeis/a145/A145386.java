package irvine.oeis.a145;
// Generated by gen_seq4.pl 2025-06-03.ack/multia at 2025-06-03 20:14

import irvine.oeis.transform.MultiTransformSequence;

/**
 * A145386 a(1) = 1; a(n) = a(n-1)*(2*(n-1)+a(n-1)) for n &gt; 1.
 * @author Georg Fischer
 */
public class A145386 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A145386() {
    super(1, (self, n) -> self.a(n - 1).multiply(self.a(n - 1).add(2 * (n - 1))), "1");
  }
}
