package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068675 Numbers k such that a prime can be obtained by inserting a 1 before, somewhere inside, or after the digits of k.
 * @author Sean A. Irvine
 */
public class A068675 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final String s = String.valueOf(++mN);
      for (int k = s.length(); k >= 0; --k) {
        if (new Z(s.substring(0, k) + "1" + s.substring(k)).isProbablePrime()) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
