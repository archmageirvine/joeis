package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.a002.A002088;

/**
 * A048290 Numbers m that divide Sum_{k=1..m} phi(k).
 * @author Sean A. Irvine
 */
public class A048290 extends A002088 {

  private long mN = 0;
  {
    setOffset(1);
    super.next(); // skip 0
  }

  @Override
  public Z next() {
    while (true) {
      if (super.next().mod(++mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
