package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A066461 a(3) = 5; a(n) = min(x&gt;1,x^2+x*n+n^2 = 1 mod(x+n)).
 * @author Sean A. Irvine
 */
public class A066461 extends Sequence3 {

  private long mN = 2;

  @Override
  public Z next() {
    if (++mN == 3) {
      return Z.FIVE;
    }
    long k = 1;
    while (true) {
      if ((++k * k + k * mN + mN * mN) % (k + mN) == 1) {
        return Z.valueOf(k);
      }
    }
  }
}

