package irvine.oeis;

import irvine.math.z.Z;

/**
 * The nonzero terms of another sequence.
 * @author Sean A. Irvine
 */
public class NonzeroSequence implements Sequence {

  private final Sequence mSeq;

  /**
   * Nonzero sequence.
   * @param seq underlying sequence
   */
  public NonzeroSequence(final Sequence seq) {
    mSeq = seq;
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = mSeq.next();
      if (t == null || !t.isZero()) {
        return t;
      }
    }
  }
}
