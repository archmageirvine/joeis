package irvine.oeis.a070;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A070892 Numbers n such that absolute value of Sum_{k=1..n} mu(k)/k sets a new minimum.
 * @author Sean A. Irvine
 */
public class A070892 extends A070888 {

  private Q mMin = Q.TWO;

  @Override
  public Z next() {
    while (true) {
      super.next();
      final Q s = mSum.abs();
      if (s.compareTo(mMin) < 0) {
        mMin = s;
        return Z.valueOf(mN);
      }
    }
  }
}
