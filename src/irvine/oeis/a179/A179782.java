package irvine.oeis.a179;
// manually at 2024-03-28

import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A179782 Numbers n such that the decimal representation of n is contained as substring in that of the n-th pentagonal number.
 * @author Georg Fischer
 */
public class A179782 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A179782() {
    super(1, 0, n -> Z.valueOf(n).multiply(3L * n - 1).divide2().toString().indexOf(Integer.toString(n)) >= 0);
  }
}
