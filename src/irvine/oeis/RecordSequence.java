package irvine.oeis;

import irvine.math.z.Z;

/**
 * A sequence consisting of consecutive records in another sequence.
 * By default, uses the absolute value of the terms of the underlying sequence, but
 * this behavior can be turned off during construction.
 * @author Sean A. Irvine
 */
public class RecordSequence extends AbstractSequence {

  private static final int DEFOFF = 1;
  // A265913(1) -80561663527802406257321747 has current minimal 1st term
  static final Z DEFAULT_MIN = new Z("-9999999999999999999999999999999999999999999999999999999999999999"); // 64 digits
  private final boolean mUseAbs;
  private final Sequence mSeq;
  private Z mMax;

  /**
   * Creates a record sequence of another sequence.
   * @param offset first index of target sequence
   * @param seq underlying sequence
   * @param initial the initial maximum
   * @param useAbs use the absolute value of the underlying sequence
   */
  public RecordSequence(final int offset, final Sequence seq, final Z initial, final boolean useAbs) {
    super(offset);
    mSeq = seq;
    mMax = initial;
    mUseAbs = useAbs;
  }

  /**
   * Creates a record sequence of another sequence.
   * @param offset first index of target sequence
   * @param seq underlying sequence
   * @param initial the initial maximum
   */
  public RecordSequence(final int offset, final Sequence seq, final Z initial) {
    this(offset, seq, initial, true);
  }

  /**
   * Creates a record sequence of another sequence.
   * @param offset first index of target sequence
   * @param seq underlying sequence
   * @param useAbs use the absolute value of the underlying sequence
   */
  public RecordSequence(final int offset, final Sequence seq, final boolean useAbs) {
    this(offset, seq, DEFAULT_MIN, useAbs);
  }

  /**
   * Creates a record sequence of another sequence.
   * @param seq underlying sequence
   * @param useAbs use the absolute value of the underlying sequence
   */
  public RecordSequence(final Sequence seq, final boolean useAbs) {
    this(DEFOFF, seq, DEFAULT_MIN, useAbs);
  }

  /**
   * Creates a record sequence of another sequence.
   * @param seq underlying sequence
   * @param initial the initial maximum
   */
  public RecordSequence(final Sequence seq, final Z initial) {
    this(DEFOFF, seq, initial);
  }

  /**
   * Creates a record sequence of another sequence.
   * @param offset first index of target sequence
   * @param seq underlying sequence
   */
  public RecordSequence(final int offset, final Sequence seq) {
    this(offset, seq, DEFAULT_MIN);
  }

  /**
   * Creates a record sequence of another sequence.
   * @param seq underlying sequence
   */
  public RecordSequence(final Sequence seq) {
    this(seq, DEFAULT_MIN);
  }

  /**
   * Defines the condition for the inclusion of a term of the underlying sequence
   * into this sequence. By default, it accepts all terms, but it can be overridden
   * to skip certain terms.
   * @param term term of the underlying sequence
   * @return true if the term should be included, false otherwise.
   * This default implementation takes all terms from the underlying sequence.
   */
  public boolean isOk(final Z term) {
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = mUseAbs ? mSeq.next().abs() : mSeq.next();
      if (isOk(t) && t.compareTo(mMax) > 0) {
        mMax = t;
        return mMax;
      }
    }
  }
}
