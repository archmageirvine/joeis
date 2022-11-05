package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.a002.A002110;

/**
 * A057704 Primorial - 1 prime indices: integers m such that the m-th primorial minus 1 is prime.
 * @author Sean A. Irvine
 */
public class A057704 extends A002110 {

  private long mN = -1;
  {
    setOffset(1);
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (super.next().subtract(1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
