package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077292 Numbers k with the property that k divides one of the concatenations (k-1)(k-2) or (k-2)(k-1).
 * @author Sean A. Irvine
 */
public class A077292 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final String s = String.valueOf(mN - 1);
      final String t = String.valueOf(mN);
      ++mN;
      if (new Z(s + t).mod(mN) == 0 || new Z(t + s).mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
