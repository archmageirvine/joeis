package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066333 a(n) = min(x : x^2 + n^2 = 0 mod (x+n-1)).
 * @author Sean A. Irvine
 */
public class A066333 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z n2 = Z.valueOf(++mN).square();
    long k = 0;
    while (true) {
      if (n2.add(++k * k).mod(mN + k - 1) == 0) {
        return Z.valueOf(k);
      }
    }
  }
}
