package irvine.oeis;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;

import java.util.ArrayList;

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
}

