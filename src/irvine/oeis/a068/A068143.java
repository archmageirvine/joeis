package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000217;

/**
 * A068143 Triangular numbers which are products of triangular numbers larger than 1.
 * @author Sean A. Irvine
 */
public class A068143 extends Sequence1 {

  private final DirectSequence mTriangular = DirectSequence.create(new A000217().skip(2));
  private int mN = -1;

  private boolean is(final Z t, final int maxIndex) {
    if (Z.ONE.equals(t)) {
      return true;
    }
    for (int k = maxIndex; k >= 0; --k) {
      final Z[] qr = t.divideAndRemainder(mTriangular.a(k));
      if (qr[1].isZero() && is(qr[0], k)) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = mTriangular.a(++mN);
      if (is(t, mN - 1)) {
        return t;
      }
    }
  }
}
