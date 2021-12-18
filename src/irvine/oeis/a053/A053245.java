package irvine.oeis.a053;

import irvine.math.z.Z;

/**
 * A053192.
 * @author Sean A. Irvine
 */
public class A053245 extends A053238 {

  private long mN = 0;
  private Z mA = super.next();

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z t = mA;
      mA = super.next();
      if (Z.ONE.equals(t) && Z.ONE.equals(mA)) {
        return Z.valueOf(mN);
      }
    }
  }
}
