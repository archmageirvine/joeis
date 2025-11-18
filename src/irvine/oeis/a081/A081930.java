package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081930 Triangle read by rows in which row n gives n smallest palindromic numbers of n digits each.
 * @author Sean A. Irvine
 */
public class A081930 extends Sequence1 {

  // After Pontus von Br&ouml;mssen

  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    final String s = Z.TEN.pow((mN - 1) / 2).add(mM).subtract(mN == 1 ? 2 : 1).toString();
    return new Z(s + new StringBuilder(s).reverse().substring(mN & 1));
  }
}
