package irvine.oeis.a085;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A085305 Numbers such that first reversing digits and then squaring equals the result of first squaring and then reversing.
 * @author Sean A. Irvine
 */
public class A085305 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A085305() {
    super(1, 0, k -> k == 0 || (k % 10 != 0 && Functions.REVERSE.z(k).square().equals(Functions.REVERSE.z(Z.valueOf(k).square()))));
  }
}
