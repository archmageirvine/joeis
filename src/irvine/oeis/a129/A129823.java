package irvine.oeis.a129;

import java.util.LinkedList;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A129823 Quadruples (k,k+2,k+4,k+6) such that k is odd and k, k+2, k+4, and k+6 are composite.
 * @author Sean A. Irvine
 */
public class A129823 extends Sequence1 {

  private final LinkedList<Long> mA = new LinkedList<>();
  private long mN = -1;

  @Override
  public Z next() {
    while (mA.isEmpty()) {
      mN += 2;
      if (!Predicates.PRIME.is(mN) && !Predicates.PRIME.is(mN + 2) && !Predicates.PRIME.is(mN + 4) && !Predicates.PRIME.is(mN + 6)) {
        mA.add(mN);
        mA.add(mN + 2);
        mA.add(mN + 4);
        mA.add(mN + 6);
      }
    }
    return Z.valueOf(mA.pollFirst());
  }
}
