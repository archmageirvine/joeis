package irvine.oeis.a007;

import irvine.math.z.Z;

/**
 * A007675 Numbers n such that n, n+1 and n+2 are squarefree.
 * @author Sean A. Irvine
 */
public class A007675 extends A007674 {

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
