package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073259.
 * @author Sean A. Irvine
 */
public class A073339 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long m = ++mN;
    long k = 0;
    while (true) {
      m -= ++k / m;
      if (m == 0) {
        return Z.valueOf(k + 1);
      }
    }
  }
}

