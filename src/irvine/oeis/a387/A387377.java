package irvine.oeis.a387;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A387377 In the prime factorization of n, replace 2's with 3's, replace 3's with 5's and replace 5's with 2's.
 * @author Sean A. Irvine
 */
public class A387377 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long m = ++mN;
    int c2 = 0;
    int c3 = 0;
    int c5 = 0;
    while ((m & 1) == 0) {
      ++c2;
      m >>>= 1;
    }
    while (m % 3 == 0) {
      ++c3;
      m /= 3;
    }
    while (m % 5 == 0) {
      ++c5;
      m /= 5;
    }
    return Z.valueOf(m * LongUtils.pow(3, c2) * LongUtils.pow(5, c3)).shiftLeft(c5);
  }
}
