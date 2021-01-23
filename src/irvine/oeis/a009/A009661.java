package irvine.oeis.a009;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A009661 Smallest number m such that m^m+1 is divisible by n.
 * @author Sean A. Irvine
 */
public class A009661 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    int m = -1;
    while (true) {
      final Z zm = Z.valueOf(++m);
      if (zm.pow(m).add(1).mod(mN) == 0) {
        return zm;
      }
    }
  }
}
