package irvine.oeis.a083;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083752 Minimal k &gt; n such that (4*k+3*n) * (4*n+3*k) is a square.
 * @author Sean A. Irvine
 */
public class A083752 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z n3 = Z.valueOf(3 * ++mN);
    final Z n4 = Z.valueOf(4 * mN);
    long k = mN;
    while (true) {
      ++k;
      if (Predicates.SQUARE.is(n4.add(3 * k).multiply(n3.add(4 * k)))) {
        return Z.valueOf(k);
      }
    }
  }
}
