package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002473.
 * @author Sean A. Irvine
 */
public class A002473 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      long n = ++mN;
      while ((n & 1) == 0) {
        n >>>= 1;
      }
      while (n % 3 == 0) {
        n /= 3;
      }
      while (n % 5 == 0) {
        n /= 5;
      }
      while (n % 7 == 0) {
        n /= 7;
      }
      if (n == 1) {
        return Z.valueOf(mN);
      }
    }
  }
}
