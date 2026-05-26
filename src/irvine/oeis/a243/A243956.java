package irvine.oeis.a243;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.DirectSequence;
import irvine.oeis.TwoParameterFormSequence;
import irvine.oeis.a002.A002822;

/**
 * A243956 Positive numbers n without a decomposition into a sum n = i+j such that 6i-1, 6i+1, 6j-1, 6j+1 are twin primes.
 * @author Sean A. Irvine
 */
public class A243956 extends ComplementSequence {

  private static final DirectSequence S = DirectSequence.create(new A002822());

  /** Construct the sequence. */
  public A243956() {
    super(1, Z.ONE, new TwoParameterFormSequence(1, 1, 1, (i, j) -> S.a(i).add(S.a(j))));
  }
}
