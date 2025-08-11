package irvine.oeis.a079;

import irvine.math.z.Z;
import irvine.oeis.a000.A000594;

/**
 * A079334 Numbers k such that k divides tau(k) and k+1 divides tau(k+1), where tau(k)=A000594(k) is Ramanujan's tau function; i.e., k and k+1 are in A063938.
 * @author Sean A. Irvine
 */
public class A079334 extends A000594 {

  private Z mA = super.next();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z t = mA;
      mA = super.next();
      if (t.mod(mN) == 0 && mA.mod(mN + 1) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
