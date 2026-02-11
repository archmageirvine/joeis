package irvine.oeis.a391;

import irvine.math.z.Z;
import irvine.oeis.a392.A392758;

/**
 * A391879 allocated for Juri-Stepan Gerasimov.
 * @author Sean A. Irvine
 */
public class A391879 extends A392758 {

  private long mN = 0;
  private Z mA = super.next();

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z t = mA;
      mA = super.next();
      if (mA.equals(t)) {
        return Z.valueOf(mN);
      }
    }
  }
}
