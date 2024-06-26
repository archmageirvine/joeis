package irvine.oeis.a175;
// Generated by gen_seq4.pl 2024-05-11/multrar at 2024-05-11 21:20

import irvine.oeis.transform.MultiTransformSequence;

/**
 * A175978 a(1) = 1, for n &gt;= 2: a(n) = a(n-1)^(n-1) + 1.
 * @author Georg Fischer
 */
public class A175978 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A175978() {
    super(1, (self, n) -> self.a(n - 1).pow(n - 1).add(1), "1");
  }
}
