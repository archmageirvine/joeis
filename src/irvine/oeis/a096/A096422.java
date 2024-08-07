package irvine.oeis.a096;
// Generated by gen_seq4.pl 2024-08-02.ack/multrar at 2024-08-02 23:54

import irvine.oeis.transform.MultiTransformSequence;

/**
 * A096422 a(1)=a(2)=a(3)=1, a(n) = 2*a(n-1)*a(n-3) + a(n-3)^2 for n &gt; 3.
 * @author Georg Fischer
 */
public class A096422 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A096422() {
    super(1, (self, n) -> self.a(n - 1).multiply(2).multiply(self.a(n - 3)).add(self.a(n - 3).square()), "1, 1, 1");
  }
}
