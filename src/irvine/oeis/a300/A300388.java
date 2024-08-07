package irvine.oeis.a300;
// Generated by gen_seq4.pl 2024-07-11/multrar at 2024-07-11 18:00

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A300388 The number of paths of length 11*n from the origin to the line y = 2*x/9 with unit East and North steps that stay below the line or touch it.
 * @author Georg Fischer
 */
public class A300388 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A300388() {
    super(0, (self, n) -> Integers.SINGLETON.sum(0, n - 1, k -> Binomial.binomial(11L * n - 11L * k, 2L * n - 2L * k).multiply(self.a(k)).divide(11)).divide(n), "1");
  }
}
