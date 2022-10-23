package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A036780 Primes of the form n + Sum_{i=1..n} i!.
 * @author Sean A. Irvine
 */
public class A036780 extends Sequence1 {

  private long mN = 0;
  private Z mF = Z.ONE;
  private Z mS = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mF = mF.multiply(++mN);
      mS = mS.add(mF);
      final Z a = mS.add(mN);
      if (a.isProbablePrime()) {
        return a;
      }
    }
  }
}
