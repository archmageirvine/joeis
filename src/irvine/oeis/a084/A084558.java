package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A084558 a(0) = 0; for n &gt;= 1: a(n) = largest m such that n &gt;= m!.
 * @author Georg Fischer
 */
public class A084558 extends AbstractSequence implements DirectSequence {

  private int mN; // current index
  // Convenience for all factorials which can fit in a long
  private static final long[] FACTORIAL = {1, 1, 2, 6, 24,
    120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600, 6227020800L, 87178291200L, 1307674368000L,
    20922789888000L, 355687428096000L, 6402373705728000L, 121645100408832000L, 2432902008176640000L // 20!
  };
  private final int MAX_FACT = FACTORIAL.length; // also tested with "= 3"

  /** Construct the sequence. */
  public A084558() {
    super(0);
    mN = -1;
  }

  @Override
  public Z next() {
    return a(++mN);
  }

  @Override
  public Z a(final Z nz) {
    if (nz.isZero()) {
      return Z.ZERO;
    }
    int m = 0;
    while (nz.compareTo(FACTORIAL[m]) >= 0 && m < MAX_FACT) {
      ++m;
    }
    if (m >= MAX_FACT) { // here m == mAX_FACT
      Z f = Z.valueOf(FACTORIAL[m - 1]).multiply(m); // f = m! = MAX_FACT!
      while (nz.compareTo(f) >= 0) {
        f = f.multiply(++m);
      }
    }
    return Z.valueOf(m - 1);
  }

  @Override
  public Z a(final int n) {
    if (n == 0) {
      return Z.ZERO;
    }
    int m = 0;
    while (n >= FACTORIAL[m] && m < MAX_FACT) {
      ++m;
    }
    if (m >= MAX_FACT) { // here m == mAX_FACT
      final Z nz = Z.valueOf(n);
      Z f = Z.valueOf(FACTORIAL[m - 1]).multiply(m); // f = m! = MAX_FACT!
      while (nz.compareTo(f) >= 0) {
        f = f.multiply(++m);
      }
    }
    return Z.valueOf(m - 1);
  }
}
