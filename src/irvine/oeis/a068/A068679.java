package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068679 Numbers which yield a prime whenever a 1 is inserted anywhere in them (including at the beginning or end).
 * @author Sean A. Irvine
 */
public class A068679 extends Sequence1 {

  private long mN = 0;

  private boolean is(final String s) {
    for (int k = s.length(); k >= 0; --k) {
      if (!new Z(s.substring(0, k) + "1" + s.substring(k)).isProbablePrime()) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(String.valueOf(++mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
