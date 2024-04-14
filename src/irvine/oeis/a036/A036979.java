package irvine.oeis.a036;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A036979 Primes arising in A036978.
 * @author Sean A. Irvine
 */
public class A036979 extends Sequence1 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      final Z m = Functions.LOOK_AND_SAY.z(mN);
      if (m.isProbablePrime()) {
        return m;
      }
    }
  }
}

