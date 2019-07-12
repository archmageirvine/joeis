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

  protected Polynomial<Z> polynomial() {
    return new Polynomial<>(Z.ZERO, Z.ONE, this);
  }

  protected abstract Z computeNext();

  @Override
  public Z next() {
    final Z t = computeNext();
    add(t);
    return t;
  }

  /**
   * Return <code>a(n)</code>. If the value of <code>a(n)</code> is not already computed,
   * automatically compute all terms &lt;= n before returning with <code>a(n)</code>.
   * @param n index
   * @return value of <code>a(n)</code>
   */
  public Z a(final int n) {
    while (n >= size()) {
      add(computeNext());
    }
    return get(n);
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

