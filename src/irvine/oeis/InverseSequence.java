package irvine.oeis;

import java.util.TreeMap;

import irvine.math.z.Z;

/**
 * A sequence reporting the position of <code>n</code> in a sequence.  It assumes
 * that every value not less than the initial value occurs at some point in the
 * sequence.  Sequences exceeding the value of a long will also fail at some point.
 * @author Sean A. Irvine
 */
public class InverseSequence extends AbstractSequence {

  private static final int DEFOFF = 1;
  private static final int BIT_LIMIT = 50;
  private final Sequence mS;
  protected final TreeMap<Long, Long> mMap = new TreeMap<>();
  protected long mN;
  private long mM;

  /**
   * Construct a new sequence of positions.
   * @param offset first index of target sequence
   * @param seq underlying sequence
   * @param initial starting value to search for
   * @param offset1 offset of seq
   */
  public InverseSequence(final int offset, final Sequence seq, final long initial, final long offset1) {
    super(offset);
    mS = seq;
    mN = initial - 1;
    mM = offset1 - 1;
  }

  /**
   * Construct a new sequence of positions.
   * @param seq underlying sequence
   * @param initial starting value to search for
   * @param offset1 offset of seq
   */
  public InverseSequence(final Sequence seq, final long initial, final int offset1) {
    this(DEFOFF, seq, initial, offset1);
  }

  /**
   * Construct a new sequence of positions.
   * @param seq underlying sequence
   * @param initial starting value to search for
   */
  public InverseSequence(final int offset, final Sequence seq, final long initial) {
    this(offset, seq, initial, seq.getOffset());
  }

  /**
   * Construct a new sequence of positions.
   * @param seq underlying sequence
   * @param initial starting value to search for
   */
  public InverseSequence(final Sequence seq, final long initial) {
    this(DEFOFF, seq, initial, seq.getOffset());
  }

  /**
   * Construct a new sequence of positions.
   * @param seq underlying sequence
   */
  public InverseSequence(final int offset, final Sequence seq) {
    this(offset, seq, 1);
  }

  /**
   * Construct a new sequence of positions.
   * @param seq underlying sequence
   */
  public InverseSequence(final Sequence seq) {
    this(DEFOFF, seq, 1);
  }

  @Override
  public Z next() {
    ++mN;
    while (!mMap.containsKey(mN)) {
      ++mM;
      final Z s = mS.next();
      // If s is very large, then we will never be able to generate sufficient sequence
      // to reach that value.  So we simply discard big values.
      if (s.bitLength() < BIT_LIMIT) {
        mMap.putIfAbsent(s.longValueExact(), mM);
      }
    }
    return Z.valueOf(mMap.remove(mN));
  }
}
