package irvine.oeis.a103;
// Generated by gen_seq4.pl 2025-04-28.ack/multrar at 2025-04-28 23:36

import irvine.oeis.transform.MultiTransformSequence;

/**
 * A103487 a(0)=7; a(1)=11; a(2)=13; a(3)=17; a(n) = |a(n-2)+a(n-3)-a(n-4)|.
 * @author Georg Fischer
 */
public class A103487 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A103487() {
    super(0, (self, n) -> self.a(n - 2).add(self.a(n - 3)).subtract(self.a(n - 4)).abs(), "7, 11, 13, 17");
  }
}
