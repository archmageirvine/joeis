package irvine.oeis.a071;

import irvine.math.z.InverseEuler;
import irvine.math.z.Z;
import irvine.oeis.a006.A006567;

/**
 * A071563.
 * @author Sean A. Irvine
 */
public class A071615 extends A006567 {

  private long mN = 0;

  @Override
  public Z next() {
    mN += 2;
    long m = 1;
    while (!InverseEuler.inversePhi(Z.valueOf(mN * m)).isEmpty()) {
      m += 2;
    }
    return Z.valueOf(m);
  }
}
