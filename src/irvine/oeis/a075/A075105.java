package irvine.oeis.a075;
// manually 2023-10-03/simtraf at 2023-10-03 12:50

import irvine.math.IntegerUtils;
import irvine.math.q.Q;
import irvine.oeis.LambdaSequence;

/**
 * A075105 Numerator of n/floor(log_2(n)); denominator is A075106(n).
 * @author Georg Fischer
 */
public class A075105 extends LambdaSequence {

  /** Construct the sequence. */
  public A075105() {
    super(2, n -> new Q(n, IntegerUtils.floorLog2(n)).num());
  }
}
