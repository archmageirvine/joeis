package irvine.oeis.a293;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a174.A174221;

/**
 * A293979 Start with 83; if even, divide by 2; if odd,
 * add next three primes: Orbit of 83 under iterations of A174221, the "PrimeLatz" map.
 * @author Georg Fischer
 */
public class A293979 extends AbstractSequence {

  private Z mA; // next term
  private final A174221 mSeq = new A174221(); // DirectSequence

  /** Construct the sequence. */
  public A293979() {
    this(0, 83);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param start start the trajectory with this term
   */
  public A293979(final int offset, final int start) {
    super(offset);
    mA = Z.valueOf(start);
  }

  @Override
  public Z next() {
    final Z result = mA;
    mA = mSeq.a(mA);
    return result;
  }
}
