package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063917.
 * @author Sean A. Irvine
 */
public class A063917 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long a = 1 % mN;
    long b = 2 % mN;
    long c = 3 % mN;
    long k = 1;
    while (true) {
      if (a == 0) {
        return Z.valueOf(k);
      }
      if (b == 0) {
        return Z.valueOf(k + 1);
      }
      if (c == 0) {
        return Z.valueOf(k + 2);
      }
      k += 3;
      a *= k;
      a %= mN;
      b *= k + 1;
      b %= mN;
      c *= k + 2;
      c %= mN;
    }
  }
}
