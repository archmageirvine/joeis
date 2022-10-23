package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A029931 If 2n = Sum 2^e_i, a(n) = Sum e_i.
 * @author Sean A. Irvine
 */
public class A029931 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    long m = ++mN;
    long sum = 0;
    int k = 1;
    while (m != 0) {
      if ((m & 1) == 1) {
        sum += k;
      }
      ++k;
      m >>>= 1;
    }
    return Z.valueOf(sum);
  }
}
