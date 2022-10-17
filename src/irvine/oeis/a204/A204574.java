package irvine.oeis.a204;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.SequenceWithOffset;
import irvine.oeis.a001.A001541;

/**
 * A204574 Numbers such that floor[a(n)^2/2] is a square (A001541), written in binary.
 * @author Georg Fischer
 */
public class A204574 implements SequenceWithOffset {

  private int mN;
  private Sequence mSeq;
  private int mBase;
  private int mOffset;
  private Z[] mPreTerms;

  /** Construct the sequence. */
  public A204574() {
    this(1, new A001541(), 2, 0);
  }

  /**
   * Generic constructor with default base 2 and no prepended terms
   * @param seq underlying sequence
   */
  public A204574(final Sequence seq) {
    this(1, seq, 2, new long[0]);
  }

  /**
   * Generic constructor with base and no prepended terms
   * @param seq underlying sequence
   * @param base "written in" this base
   */
  public A204574(final Sequence seq, final int base) {
    this(1, seq, base, new long[0]);
  }

  /**
   * Generic constructor with parameters
   * @param seq underlying sequence
   * @param base "written in" this base
   * @param preTerms leading terms to be prefixed
   */
  public A204574(final Sequence seq, final int base, final long... preTerms) {
    this(1, seq, base, preTerms);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param seq underlying sequence
   * @param base "written in" this base
   * @param preTerms leading terms to be prefixed
   */
  public A204574(final int offset, final Sequence seq, final int base, final long... preTerms) {
    mOffset = offset;
    mSeq = seq;
    mBase = base;
    mPreTerms = new Z[preTerms.length];
    for (int i = 0; i < preTerms.length; ++i) {
      mPreTerms[i] = Z.valueOf(preTerms[i]);
    }
    mN = -1;
  }

  @Override
  public int getOffset() {
    return mOffset;
  }

  @Override
  public Z next() {
    ++mN;
    if (mN < mPreTerms.length) {
      return mPreTerms[mN];
    }
    return new Z(mSeq.next().toString(mBase));
  }
}
