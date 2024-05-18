package irvine.oeis.a069;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000217;

/**
 * A069702 Triangular numbers with internal digits also forming a triangular number.
 * @author Sean A. Irvine
 */
public class A069702 extends Sequence1 {

  private final Sequence mSeq = new A000217().skip(14);
  private Z mM = Z.TEN;
  private Z mT = Z.valueOf(100);

  @Override
  public Z next() {
    while (true) {
      final Z tri = mSeq.next();
      if (tri.compareTo(mT) >= 0) {
        mM = mT;
        mT = mT.multiply(10);
      }
      final Z inner = tri.mod(mM).divide(10);
      if (Predicates.TRIANGULAR.is(inner)) {
        return tri;
      }
    }
  }
}
