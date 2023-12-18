package irvine.oeis.a067;

import irvine.math.z.Z;

/**
 * A067396 a(n) is the position of the n-th occurrence of the pair "2,2" in A067395 (the first difference sequence of A067368).
 * @author Sean A. Irvine
 */
public class A067396 extends A067395 {

  private long mN = 0;
  private Z mA = super.next();

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z a = mA;
      mA = super.next();
      if (Z.TWO.equals(a) && Z.TWO.equals(mA)) {
        return Z.valueOf(mN);
      }
    }
  }
}
