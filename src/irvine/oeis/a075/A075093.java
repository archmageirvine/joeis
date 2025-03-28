package irvine.oeis.a075;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a069.A069567;

/**
 * A075093 Smallest member of Ormiston prime triple.
 * @author Sean A. Irvine
 */
public class A075093 extends A069567 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z q = mPrime.nextPrime(mPrime.nextPrime(p));
      if (Arrays.equals(ZUtils.digitCounts(p), ZUtils.digitCounts(q))) {
        return p;
      }
    }
  }
}
