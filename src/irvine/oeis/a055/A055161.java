package irvine.oeis.a055;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A055161 n has digits in descending order and n=a+b where a has the digits of n in another order and b has the digits of n in ascending order (perhaps with leading zeros).
 * @author Sean A. Irvine
 */
public class A055161 extends Sequence0 {

  private Z mN = Z.valueOf(494);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z desc = Functions.DIGIT_SORT_DESCENDING.z(mN);
      if (mN.equals(desc.subtract(Functions.DIGIT_SORT_ASCENDING.z(mN)))) {
        return desc;
      }
    }
  }
}
