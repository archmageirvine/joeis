package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084709 a(1) = 4, for n &gt; 1, a(n) = smallest multiple of a(n-1) such that a(n)-1 and a(n)+1 are twin primes.
 * @author Sean A. Irvine
 */
public class A084709 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.FOUR;
      return mA;
    }
    final Z t = mA;
    while (true) {
      mA = mA.add(t);
      if (mA.subtract(1).isProbablePrime() && mA.add(1).isProbablePrime()) {
        return mA;
      }
    }
  }
}
