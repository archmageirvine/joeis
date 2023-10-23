package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066487 a(n) = min( x : x^4 + n^4 = 0 mod (x+n-1) ).
 * @author Sean A. Irvine
 */
public class A066487 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z n4 = Z.valueOf(++mN).pow(4);
    long k = 0;
    while (true) {
      if (n4.add(Z.valueOf(++k).pow(4)).mod(mN + k - 1) == 0) {
        return Z.valueOf(k);
      }
    }
  }
}
