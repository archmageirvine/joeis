package irvine.oeis;

import java.util.ArrayList;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;

/**
 * Base case for sequence where all terms are retained in memory. Useful
 * for implementing sequences that depend on many earlier terms.
 * @author Sean A. Irvine
 */
public abstract class MemorySequence extends ArrayList<Z> implements Sequence {

  private final int mOffset;
  private final int mNumInitialTerms;
  private int mPos = 0;

  /**
   * Construct a new memory sequence with specified offset.
   * @param offset the offset
   * @param initialTerms initial terms (starting at offset)
   */
  public MemorySequence(final int offset, final long... initialTerms) {
    mOffset = offset;
    mNumInitialTerms = initialTerms.length;
    for (final long t : initialTerms) {
      add(Z.valueOf(t));
    }
  }

  /**
   * Construct a new memory sequence with specified offset.
   * @param offset the offset
   */
  public MemorySequence(final int offset) {
    mOffset = offset;
    mNumInitialTerms = 0;
  }

  /**
   * Construct a new memory sequence with offset 0.
   */
  public MemorySequence() {
    this(0);
  }

  /**
   * Return this sequence as a polynomial.
   * @return polynomial
   */
  public Polynomial<Z> polynomial() {
    return new Polynomial<>(Z.ZERO, Z.ONE, this);
  }

  protected abstract Z computeNext();

  @Override
  public Z next() {
    if (mPos < mNumInitialTerms) {
      // These terms are preloaded into the list
      return super.get(mPos++);
    }
    final Z t = computeNext();
    add(t);
    return t;
  }

  @Override
  public Z get(final int n) {
    return super.get(n - mOffset);
  }

  /**
   * Return <code>a(n)</code>. If the value of <code>a(n)</code> is not already computed,
   * automatically compute all terms &lt;= n before returning with <code>a(n)</code>.
   * @param n index
   * @return value of <code>a(n)</code>
   */
  public Z a(final int n) {
    final int m = n - mOffset;
    while (m >= size()) {
      add(computeNext());
    }
    return get(n); // NOTE: This really does need to be n
  }

  /**
   * Get the offset for this sequence.
   * @return offset
   */
  public int getOffset() {
    return mOffset;
  }

  /**
   * Convert an arbitrary sequence into a cached sequence.
   * @param seq underlying sequence
   * @return cached version
   */
  public static MemorySequence cachedSequence(final Sequence seq) {
    return seq instanceof MemorySequence ? (MemorySequence) seq : new MemorySequence() {
      @Override
      protected Z computeNext() {
        return seq.next();
      }
    };
  }
}

