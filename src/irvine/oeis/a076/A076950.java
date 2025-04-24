package irvine.oeis.a076;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076950 Smallest k such that nk-1 is a cube.
 * @author Sean A. Irvine
 */
public class A076950 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    Z t = Z.NEG_ONE;
    while (true) {
      ++k;
      t = t.add(mN);
      if (Predicates.CUBE.is(t)) {
        return Z.valueOf(k);
      }
    }
  }
}

