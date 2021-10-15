package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A052009 Sum of 'n with digits sorted ascending' and 'n with digits sorted descending' is prime.
 * @author Sean A. Irvine
 */
public class A052009 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (ZUtils.sortDigitsAscending(mN).add(ZUtils.sortDigitsDescending(mN)).isProbablePrime()) {
        return mN;
      }
    }
  }
}
