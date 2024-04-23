package irvine.oeis.a084;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;

/**
 * A084558 a(0) = 0; for n &gt;= 1: a(n) = largest m such that n &gt;= m!.
 * @author Georg Fischer
 */
public class A084558 extends AbstractSequence implements DirectSequence {

  private int mN; // current index

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
    while (nz.compareTo(Functions.FACTORIAL.z(m)) >= 0) {
      ++m;
    }
    return Z.valueOf(m - 1);
  }

  @Override
  public Z a(final int n) {
    if (n == 0) {
      return Z.ZERO;
    }
    int m = 0;
    while (n >= Functions.FACTORIAL.l(m)) {
      ++m;
    }
    return Z.valueOf(m - 1);
  }
}
