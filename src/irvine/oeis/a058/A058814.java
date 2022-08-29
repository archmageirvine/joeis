package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.a034.A034886;

/**
 * A058814 Numbers k such that k divides the number of digits of k!.
 * @author Sean A. Irvine
 */
public class A058814 extends A034886 {

  {
    super.next();
  }

  @Override
  public Z next() {
    while (true) {
      if (super.next().mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
