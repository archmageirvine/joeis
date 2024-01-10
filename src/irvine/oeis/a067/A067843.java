package irvine.oeis.a067;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067843 Least solution k&gt;n of phi(k-n)+phi(k+n)=phi(2k).
 * @author Sean A. Irvine
 */
public class A067843 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    long k = ++mN;
    while (true) {
      if (Euler.phi(++k - mN).add(Euler.phi(k + mN)).equals(Euler.phi(2 * k))) {
        return Z.valueOf(k);
      }
    }
  }
}
