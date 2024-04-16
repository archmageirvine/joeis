package irvine.oeis.a055;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A055162 The number n has digits in ascending order and n=a-b where a has the digits of n in descending order and b has the digits of n in another order (a and b perhaps with extra zeros), ordered by a.
 * @author Sean A. Irvine
 */
public class A055162 extends Sequence1 {

  private Z mN = Z.valueOf(494);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z asc = Functions.DIGIT_SORT_ASCENDING.z(mN);
      if (mN.equals(Functions.DIGIT_SORT_DESCENDING.z(mN).subtract(asc))) {
        return asc;
      }
    }
  }
}
