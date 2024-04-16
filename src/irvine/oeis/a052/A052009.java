package irvine.oeis.a052;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence0;

/**
 * A052009 Sum of 'n with digits sorted ascending' and 'n with digits sorted descending' is prime.
 * @author Sean A. Irvine
 */
public class A052009 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Functions.DIGIT_SORT_ASCENDING.z(mN).add(ZUtils.sortDigitsDescending(mN)).isProbablePrime()) {
        return mN;
      }
    }
  }
}
