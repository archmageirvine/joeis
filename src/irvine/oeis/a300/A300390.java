package irvine.oeis.a300;
// Generated by gen_seq4.pl 2024-07-11/multrar at 2024-07-11 18:00

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A300390 The number of paths of length 7*n from the origin to the line y = 3*x/4 with unit east and north steps that stay below the line or touch it.
 * @author Georg Fischer
 */
public class A300390 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A300390() {
    super(0, (self, n) -> Integers.SINGLETON.sum(0, n - 1, k -> Binomial.binomial(7L * n - 7L * k, 3L * n - 3L * k).multiply(self.a(k)).divide(7)).divide(n), "1");
  }
}
