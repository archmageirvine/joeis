package irvine.oeis.a077;
// Generated by gen_seq4.pl 2024-07-02/multrar at 2024-07-03 22:28

import irvine.oeis.transform.MultiTransformSequence;

/**
 * A077623 a(1)=1, a(2)=2, a(3)=4, a(n) = abs(a(n-1) - a(n-2) - a(n-3)).
 * @author Georg Fischer
 */
public class A077623 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A077623() {
    super(1, (self, n) -> (self.a(n - 1).subtract(self.a(n - 2)).subtract(self.a(n - 3))).abs(), "1, 2, 4");
  }
}
