package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000999 5^a(n) divides C(2n,n).
 * @author Sean A. Irvine
 */
public class A000999 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    long c = 0;
    long k = 5;
    while (k <= mN) {
      long w = k;
      while (w % 5 == 0) {
        --c;
        w /= 5;
      }
      k += 5;
    }
    while (k <= 2 * mN) {
      long w = k;
      while (w % 5 == 0) {
        ++c;
        w /= 5;
      }
      k += 5;
    }
    return Z.valueOf(c);
  }
}

