package irvine.oeis.a075;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A075517 Created by removing all integers which take an odd number of nested digit sums to reach &lt;10.
 * @author Sean A. Irvine
 */
public class A075517 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      long m = ++mN;
      boolean even = true;
      while (m >= 10) {
        m = Functions.DIGIT_SUM.l(m);
        even = !even;
      }
      if (even) {
        return Z.valueOf(mN);
      }
    }
  }
}

