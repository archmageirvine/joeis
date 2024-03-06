package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068701.
 * @author Sean A. Irvine
 */
public class A068703 extends Sequence1 {

  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      final String s = String.valueOf(++mN);
      final String s1 = String.valueOf(mN + 1);
      final Z t = new Z(s + s1 + (mN + 2) + s1 + s);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
