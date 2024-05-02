package irvine.oeis.a050;

import java.util.Map;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000961;
import irvine.util.Pair;

/**
 * A050376 "Fermi-Dirac primes": numbers of the form p^(2^k) where p is prime and k &gt;= 0.
 * @author Sean A. Irvine
 */
public class A050376 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A050376(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A050376() {
    super(1);
  }

  private final A000961 mPP = new A000961();
  {
    mPP.nextEntry(); // skip 1
  }

  @Override
  public Z next() {
    while (true) {
      final Map.Entry<Z, Pair<Long, Long>> e = mPP.nextEntry();
      final long exponent = e.getValue().right();
      if ((exponent & (exponent - 1)) == 0) {
        return e.getKey();
      }
    }
  }
}
