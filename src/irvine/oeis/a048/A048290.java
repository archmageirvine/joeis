package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.a002.A002088;

/**
 * A048290 Numbers n such that n divides Sum_{k=1..n} phi(k).
 * @author Sean A. Irvine
 */
public class A048290 extends A002088 {

  private long mN = 0;
  {
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
