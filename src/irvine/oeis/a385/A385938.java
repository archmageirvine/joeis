package irvine.oeis.a385;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A385938 a(n) = 2*n/3 if n == 0 (mod 3), (2*n+1)/3 if n == 1 (mod 3), (7*n+1)/3 if n == 2 (mod 3).
 * @author Sean A. Irvine
 */
public class A385938 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final long r = ++mN % 3;
    if (r <= 1) {
      return Z.valueOf((2 * mN + r) / 3);
    } else {
      return Z.valueOf((7 * mN + 1) / 3);
    }
  }
}
