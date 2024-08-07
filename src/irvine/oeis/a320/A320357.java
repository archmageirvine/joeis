package irvine.oeis.a320;
// Generated by gen_seq4.pl 2024-08-02.ack/multrar at 2024-08-02 23:54

import irvine.math.function.Functions;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A320357 a(0)=1; a(1)=1; for n &gt;= 2, a(n) = a(n-1) + a(n-A000005(n)).
 * @author Georg Fischer
 */
public class A320357 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A320357() {
    super(0, (self, n) -> self.a(n - 1).add(self.a(n - Functions.SIGMA0.i(n))), "1, 1");
  }
}
