package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067042 Numbers in which the product of digits in even positions = product of digits in odd positions.
 * @author Sean A. Irvine
 */
public class A067042 extends Sequence1 {

  private long mN = 10;

  @Override
  public Z next() {
    while (true) {
      long m = ++mN;
      long[] a = {1, 1};
      int even = 0;
      while (m != 0) {
        a[even] *= m % 10;
        m /= 10;
        even = 1 - even;
      }
      if (a[0] == a[1]) {
        return Z.valueOf(mN);
      }
    }
  }
}

