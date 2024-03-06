package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068701.
 * @author Sean A. Irvine
 */
public class A068701 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final Z t = new Z(String.valueOf(++mN * mN) + mN + "1");
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
