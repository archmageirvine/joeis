package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A072607.
 * @author Sean A. Irvine
 */
public class A072633 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    long k = 0;
    while (true) {
      final Z t = Z.valueOf(++k).pow(mN);
      if (t.compareTo(sum) <= 0) {
        return Z.valueOf(k - 1);
      }
      sum = sum.add(t);
    }
  }
}
