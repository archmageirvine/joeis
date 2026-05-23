package irvine.oeis.a084;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000142;

/**
 * A084953 Numbers k such that k! is the sum of 4 but no fewer nonzero squares.
 * @author Sean A. Irvine
 */
public class A084953 extends Sequence1 {

  private final Sequence mF = new A000142().skip(10);
  private long mN = 9;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Predicates.SUM_OF_4_SQUARES.is(mF.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}
