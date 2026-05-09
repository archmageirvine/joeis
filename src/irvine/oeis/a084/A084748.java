package irvine.oeis.a084;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084748 Primes of the form n! + p where p is the smallest prime &gt; n.
 * @author Sean A. Irvine
 */
public class A084748 extends Sequence1 {

  private Z mF = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      mF = mF.multiply(++mN);
      final Z t = mF.add(Functions.NEXT_PRIME.l(mN));
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
