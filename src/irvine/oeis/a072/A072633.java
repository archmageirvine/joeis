package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A072633 Smallest positive integer m where 1^n+2^n+3^n+...+m^n is greater than or equal to (m+1)^n.
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
