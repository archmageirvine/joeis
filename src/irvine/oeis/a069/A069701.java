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
public class A069701 extends Sequence1 {

  private final Sequence mS = new A000290().skip(10);
  private Z mM = Z.TEN;
  private Z mT = Z.valueOf(100);

  @Override
  public Z next() {
    while (true) {
      final Z sq = mS.next();
      if (sq.compareTo(mT) >= 0) {
        mM = mT;
        mT = mT.multiply(10);
      }
      final Z inner = sq.mod(mM).divide(10);
      if (!inner.isZero() && Predicates.SQUARE.is(inner)) {
        return sq;
      }
    }
  }
}
