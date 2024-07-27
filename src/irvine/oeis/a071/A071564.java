package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071564 Smallest k such that n^8+k^8, n^4+k^4, n^2+k^2, n+k are simultaneously prime.
 * @author Sean A. Irvine
 */
public class A071564 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    final Z n2 = mN.square();
    final Z n4 = n2.square();
    long k = 0;
    while (true) {
      if (mN.add(++k).isProbablePrime()
        && n2.add(k * k).isProbablePrime()
        && n4.add(Z.valueOf(k).pow(4)).isProbablePrime()
        && n4.square().add(Z.valueOf(k).pow(8)).isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
  }
}
