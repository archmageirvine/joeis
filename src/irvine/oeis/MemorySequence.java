package irvine.oeis;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;

/**
 * Base case for sequence where all terms are retained in memory. Useful
 * for implementing sequences that depend on many earlier terms.
 * @author Sean A. Irvine
 */
public abstract class MemorySequence extends AbstractSequence implements Iterable<Z> {

  private final List<Z> mTerms = new ArrayList<>();
  private final int mNumInitialTerms;
  private final int mOffset;
  private int mPos = 0;

  /**
   * Construct a new memory sequence with specified offset.
   * @param offset the offset
   * @param initialTerms initial terms (starting at offset)
   */
  public MemorySequence(final int offset, final long... initialTerms) {
    super(offset);
    mOffset = offset;
    mNumInitialTerms = initialTerms.length;
    for (final long t : initialTerms) {
      mTerms.add(Z.valueOf(t));
    }
  }

  /**
   * Construct a new memory sequence with specified offset.
   * @param offset the offset
   */
  public MemorySequence(final int offset) {
    super(offset);
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
    return new Polynomial<>(Z.ZERO, Z.ONE, mTerms);
  }

  protected abstract Z computeNext();

  @Override
  public Z next() {
    if (mPos < mNumInitialTerms) {
      // These terms are preloaded into the list
      return mTerms.get(mPos++);
    }
    final Z t = computeNext();
    mTerms.add(t);
    return t;
  }

  /**
   * Return <code>a(n)</code>. If the value of <code>a(n)</code> is not already computed,
   * automatically compute all terms &lt;= n before returning with <code>a(n)</code>.
   * @param n index
   * @return value of <code>a(n)</code>
   */
  public Z a(final int n) {
    final int m = n - mOffset;
    while (m >= mTerms.size()) {
      mTerms.add(computeNext());
    }
    return mTerms.get(n - mOffset);
  }

  /**
   * Explicitly add a term into the sequence. Usually only used during construction
   * of the sequence.
   * @param value term to add
   */
  public void add(final Z value) {
    mTerms.add(value);
  }

  /**
   * Remove the term with the specified index.
   * @param n index of term to remove
   */
  public void remove(final int n) {
    mTerms.remove(n);
  }

  /**
   * The current number of terms.
   * @return number of terms
   */
  public int size() {
    return mTerms.size();
  }

  @Override
  public Iterator<Z> iterator() {
    return mTerms.iterator();
  }

  /**
   * Return the current list of terms in this memory sequence.
   * @return the terms
   */
  public List<Z> toList() {
    return mTerms;
  }

  /**
   * Return a finite sequence containing the current terms.
   * @return finite sequence.
   */
  public FiniteSequence toFiniteSequence() {
    return new FiniteSequence(mTerms);
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

  /**
   * Convert an offset and an AbstractSequence into a cached sequence with random access.
   * @param offset first index of the target sequence
   * @param seq underlying sequence
   * @param initialTerms initial terms (starting at offset)
   * @return cached version
   */
  public static MemorySequence cache(final int offset, final AbstractSequence seq, long... initialTerms) {
    return seq instanceof MemorySequence ? (MemorySequence) seq : new MemorySequence(offset, initialTerms) {
          @Override
          protected Z computeNext() {
            return seq.next();
          }
        };
  }
}

