package irvine.oeis;

import java.util.TreeMap;

import irvine.math.z.Z;

/**
 * A sequence reporting the position of <code>n</code> in a sequence.  It assumes
 * that every value not less than the initial value occurs at some point in the
 * sequence.  Sequences exceeding the value of a long will also fail at some point.
 * @author Sean A. Irvine
 */
public class PositionOfNSequence implements Sequence {

  private final Sequence mS;
  private final TreeMap<Long, Long> mMap = new TreeMap<>();
  private long mN;
  private long mM;

  /**
   * Construct a new sequence of positions.
   * @param seq underlying sequence
   * @param initial starting value to search for
   */
  public PositionOfNSequence(final Sequence seq, final long initial, final long offset) {
    mS = seq;
    mN = initial - 1;
    mM = offset - 1;
  }

  /**
   * Construct a new sequence of positions.
   * @param seq underlying sequence
   * @param initial starting value to search for
   */
  public PositionOfNSequence(final Sequence seq, final long initial) {
    this(seq, initial, 0);
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
      mMap.putIfAbsent(mS.next().longValueExact(), ++mM);
    }
    return Z.valueOf(mMap.remove(mN));
  }
}
