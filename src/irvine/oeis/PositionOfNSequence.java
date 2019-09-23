package irvine.oeis;

import java.util.TreeMap;

import irvine.math.z.Z;

/**
 * A sequence reporting the position on <code>n</code> in a permutation.  Use with
 * other non-permutations may fail or enter infinite loop.  Sequences exceeding
 * the value of a long will also fail at some point.
 * @author Sean A. Irvine
 */
public class PositionOfNSequence implements Sequence {

  private final Sequence mS;
  private final TreeMap<Long, Long> mMap = new TreeMap<>();
  private long mN;
  private long mM = 0;

  /**
   * Construct a new sequence of positions.
   * @param seq underlying sequence
   * @param initial starting value to search for
   */
  public PositionOfNSequence(final Sequence seq, final long initial) {
    mS = seq;
    mN = initial - 1;
  }

  /**
   * Construct a new sequence of positions.
   * @param seq underlying sequence
   */
  public PositionOfNSequence(final Sequence seq) {
    this(seq, 1);
  }

  @Override
  public Z next() {
    ++mN;
    while (!mMap.containsKey(mN)) {
      mMap.put(mS.next().longValueExact(), ++mM);
    }
    return Z.valueOf(mMap.remove(mN));
  }
}
