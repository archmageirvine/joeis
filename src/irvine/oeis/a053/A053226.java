package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.a000.A000203;

/**
 * A053226 Numbers k for which sigma(k) &gt; sigma(k+1).
 * @author Sean A. Irvine
 */
public class A053226 extends A000203 {

  private Z mA = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = super.next();
      if (t.compareTo(mA) > 0) {
        return Z.valueOf(mN - 1);
      }
    }
  }
}
