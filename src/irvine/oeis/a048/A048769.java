package irvine.oeis.a048;

import irvine.math.z.Z;

/**
 * A048769 Numbers n such that A048767(n+1)=A048767(n).
 * @author Sean A. Irvine
 */
public class A048769 extends A048767 {

  private Z mA = super.next();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z t = mA;
      mA = super.next();
      if (t.equals(mA)) {
        return Z.valueOf(mN);
      }
    }
  }
}
