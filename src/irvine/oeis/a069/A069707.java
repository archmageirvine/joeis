package irvine.oeis.a069;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000290;

/**
 * A069692.
 * @author Sean A. Irvine
 */
public class A069707 extends Sequence1 {

  private final Sequence mSeq = new A000290().skip();
  private Z mMod = Z.TEN;
  private Z mLim = Z.valueOf(100);

  @Override
  public Z next() {
    while (true) {
      final Z sq = mSeq.next();
      if (sq.compareTo(Z.TEN) < 0) {
        return sq;
      }
      if (sq.compareTo(mLim) >= 0) {
        mMod = mLim;
        mLim = mLim.multiply(10);
      }
      final Z[] qr = sq.divideAndRemainder(mMod);
      final Z t = mMod.multiply(sq.mod(10)).add(qr[1].divide(10).multiply(10).add(qr[0]));
      if (Predicates.SQUARE.is(t)) {
        return sq;
      }
    }
  }
}
