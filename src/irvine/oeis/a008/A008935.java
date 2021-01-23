package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008935 If 2n = Sum 2^e(k) then a(n) = Sum e(k)^2.
 * @author Sean A. Irvine
 */
public class A008935 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    long m = ++mN;
    long sum = 0;
    long k = 1;
    while (m != 0) {
      if ((m & 1) == 1) {
        sum += k * k;
      }
      ++k;
      m >>>= 1;
    }
    return Z.valueOf(sum);
  }
}
