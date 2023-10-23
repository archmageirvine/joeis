package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066486 a(n) = min( x : x^3 + n^3 == 0 mod (x+n-1) ).
 * @author Sean A. Irvine
 */
public class A066486 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z n3 = Z.valueOf(++mN).pow(3);
    long k = 0;
    while (true) {
      if (n3.add(Z.valueOf(++k).pow(3)).mod(mN + k - 1) == 0) {
        return Z.valueOf(k);
      }
    }
  }
}
