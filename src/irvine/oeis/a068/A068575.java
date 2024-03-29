package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A068575 Numbers n such that, as strings, n is a substring of prime(n).
 * @author Sean A. Irvine
 */
public class A068575 extends A000040 {

  private int mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (super.next().toString().contains(String.valueOf(++mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
