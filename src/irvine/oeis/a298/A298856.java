package irvine.oeis.a298;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a240.A240542;

/**
 * A298856 Triangular numbers k for which A240542(k) = A240542(k-1).
 * @author Sean A. Irvine
 */
public class A298856 extends Sequence1 {

  private final Sequence mS = new A240542();
  private Z mA = mS.next();
  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z t = mA;
      mA = mS.next();
      if (mA.equals(t) && Predicates.TRIANGULAR.is(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
