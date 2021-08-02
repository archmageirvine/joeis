package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A049502 Major index of n, 2nd definition.
 * @author Sean A. Irvine
 */
public class A049502 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    long m = ++mN;
    long sum = 0;
    long k = 1;
    while (m > 1) {
      if ((m & 3) == 1) {
        sum += k;
      }
      ++k;
      m >>>= 1;
    }
    return Z.valueOf(sum);
  }
}
