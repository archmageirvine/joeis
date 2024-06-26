package irvine.oeis.a175;
// Generated by gen_seq4.pl 2024-05-11/multrar at 2024-05-11 21:20

import irvine.oeis.transform.MultiTransformSequence;

/**
 * A175981 a(1) = 1, for n &gt;= 2: a(n) = a(n-1)^(n-1) - 1.
 * @author Georg Fischer
 */
public class A175981 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A175981() {
    super(1, (self, n) -> self.a(n - 1).pow(n - 1).subtract(1), "1");
  }
}
