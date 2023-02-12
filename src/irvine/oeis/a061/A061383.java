package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A061383 Arithmetic mean of digits is an integer.
 * @author Sean A. Irvine
 */
public class A061383 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      long m = ++mN;
      long sum = 0;
      long cnt = 0;
      do {
        sum += m % 10;
        m /= 10;
        ++cnt;
      } while (m != 0);
      if (sum % cnt == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

