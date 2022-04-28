package irvine.oeis.a216;
// manually deris/essent at 2022-04-28 15:40

import irvine.oeis.PrependSequence;
import irvine.oeis.a038.A038049;

/**
 * A216857 Number of connected functions from {1, 2,...,n} into a subset of {1, 2,...,n} that have a fixed point summed over all subsets.
 * @author Georg Fischer
 */
public class A216857 extends PrependSequence {

  /** Construct the sequence. */
  public A216857() {
    super(1, new A038049(), 0, 1);
  }
}
