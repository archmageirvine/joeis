package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081931 Diagonal of triangle in A081930.
 * @author Sean A. Irvine
 */
public class A081931 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final String s = Z.TEN.pow((mN - 1) / 2).add(mN).subtract(mN == 1 ? 2 : 1).toString();
    return new Z(s + new StringBuilder(s).reverse().substring(mN & 1));
  }
}
