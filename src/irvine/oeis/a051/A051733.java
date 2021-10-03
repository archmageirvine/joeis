package irvine.oeis.a051;

import irvine.math.z.Z;

/**
 * A051733 Numbers n such that A051732(n) = n-1.
 * @author Sean A. Irvine
 */
public class A051733 extends A051732 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (super.next().equals(mN)) {
        return mN.add(1);
      }
    }
  }
}
