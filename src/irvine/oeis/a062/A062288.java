package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A062288 Numbers k such that prime(k)+50 is also prime.
 * @author Sean A. Irvine
 */
public class A062288 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (super.next().add(50).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}

