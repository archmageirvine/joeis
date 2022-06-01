package irvine.oeis.a274;
// manually 2020-12-30

import irvine.oeis.recur.PaddingSequence;

/**
 * A274981 Decimal expansion of gamma(2) = 7/5.
 * @author Georg Fischer
 */
public class A274981 extends PaddingSequence {

  /** Construct the sequence. */
  public A274981() {
    super(new long[] {1, 4}, new long[] {0});
  }
}
