package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073524.
 * @author Sean A. Irvine
 */
public class A074925 extends Sequence1 {

  private Z mN = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z n3 = mN.pow(3);
      final Z n32 = n3.divide2();
      if (Functions.PREV_PRIME.z(n32).add(Functions.NEXT_PRIME.z(n32)).equals(n3)) {
        return mN;
      }
    }
  }
}
