package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A046677 Number of primes p of the form p = 4m^2+1 for n^2 &lt; m &lt; (n+1)^2.
 * @author Sean A. Irvine
 */
public class A046677 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    long cnt = 0;
    for (Z m = mN.square().add(1); m.compareTo(mN.add(1).square()) < 0; m = m.add(1)) {
      if (m.square().multiply(4).add(1).isProbablePrime()) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
