package irvine.oeis;

import java.util.TreeSet;

import irvine.math.z.Z;

/**
 * A sequence containing the distinct values from another sequence.
 * @author Sean A. Irvine
 */
public class DistinctSequence extends AbstractSequence {

  private static final int DEFOFF = 0;
  private final Sequence mSequence;
  private final TreeSet<Z> mSeen = new TreeSet<>();

  /**
   * Construct a new distinct sequence from the specified sequence
   * @param offset first index
   * @param sequence underlying sequence
   */
  public DistinctSequence(final int offset, final Sequence sequence) {
    super(offset);
    mSequence = sequence;
  }

  /**
   * Construct a new distinct sequence from the specified sequence
   * @param sequence underlying sequence
   */
  public DistinctSequence(final Sequence sequence) {
    this(DEFOFF, sequence);
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = mSequence.next();
      if (mSeen.add(t)) {
        return t;
      }
    }
  }
}
