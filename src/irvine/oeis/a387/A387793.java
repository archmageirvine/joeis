package irvine.oeis.a387;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.a389.A389524;

/**
 * A387793 allocated for Mats Granvik.
 * @author Sean A. Irvine
 */
public class A387793 extends A389524 {

  private int mN = 0;

  @Override
  public Z next() {
    return ++mN == 1 ? Z.ONE : Integers.SINGLETON.sum(1, (mN + 1) / 2, k -> mB.get(mN, mN - 2 * k + 1));
  }
}

