package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.a034.A034178;

/**
 * A058955.
 * @author Sean A. Irvine
 */
public class A058957 extends A034178 {

  @Override
  public Z next() {
    while (true) {
      if (super.next().compareTo(Z.TWO) >= 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
