package irvine.oeis;

import irvine.math.z.Z;

/**
 * A sequence consisting of the primes in another sequence.
 * @author Sean A. Irvine
 */
public class PrimeSubsequence implements Sequence {

  private final Sequence mSeq;

  /**
   * Creates a prime subsequence of another sequence.
   * @param seq underlying sequence
   */
  public PrimeSubsequence(final Sequence seq) {
    mSeq = seq;
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = mSeq.next();
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
