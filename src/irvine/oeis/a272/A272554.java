package irvine.oeis.a272;
// manually 2026-05-29

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.LambdaSequence;

/**
 * A272554 Nonnegative numbers n such that abs(1/(36)(n^6 - 126n^5 + 6217n^4 - 153066n^3 + 1987786n^2 - 13055316n + 34747236)) is prime.
 * @author Georg Fischer
 */
public class A272554 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A272554() {
    super(1, 0, new LambdaSequence(0, k -> Z.valueOf(k - 126).multiply(k).add(6217).multiply(k).subtract(153066).multiply(k)
      .add(1987786L).multiply(k).subtract(13055316L).multiply(k).add(34747236L).divide(36).abs()), PRIME);
  }
}
