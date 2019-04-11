package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.a005.A005117;

/**
 * A007674 Numbers n such that n and <code>n+1</code> are squarefree.
 * @author Sean A. Irvine
 */
public class A007674 extends A005117 {

  Z mA = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      final Z a = mA;
      mA = super.next();
      if (a.add(1).equals(mA)) {
        return a;
      }
    }
  }
}
