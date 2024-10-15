package irvine.oeis.a072;

import irvine.math.z.Z;

/**
 * A072610 Values of transition of A072608(n) from alternating behavior (0,1,0,1,..) into steadily-1 (1,1,1,..) behavior or changing back. Expressing in terms of A072609(n): at n values it switches from steadily 0 into steadily 1 successive values or back.
 * @author Sean A. Irvine
 */
public class A072610 extends A072609 {

  private long mN = -1;
  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z t = super.next();
      if (!t.equals(mA)) {
        mA = t;
        return Z.valueOf(mN);
      }
    }
  }
}
