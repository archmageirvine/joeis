package irvine.oeis.a069;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000217;

/**
 * A069692.
 * @author Sean A. Irvine
 */
public class A069708 extends Sequence1 {

  private final Sequence mSeq = new A000217().skip();
  private Z mMod = Z.TEN;
  private Z mLim = Z.valueOf(100);

  @Override
  public Z next() {
    while (true) {
      final Z tri = mSeq.next();
      if (tri.compareTo(Z.TEN) < 0) {
        return tri;
      }
      if (tri.compareTo(mLim) >= 0) {
        mMod = mLim;
        mLim = mLim.multiply(10);
      }
      final Z[] qr = tri.divideAndRemainder(mMod);
      final Z t = mMod.multiply(tri.mod(10)).add(qr[1].divide(10).multiply(10).add(qr[0]));
      if (Predicates.TRIANGULAR.is(t)) {
        return tri;
      }
    }
  }
}
