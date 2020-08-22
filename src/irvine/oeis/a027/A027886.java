package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027886 Primes of form n + (n+1)^2 + (n+2)^3 + (n+3)^4 + (n+4)^5.
 * @author Sean A. Irvine
 */
public class A027886 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z p = mN.add(mN.add(1).square()).add(mN.add(2).pow(3)).add(mN.add(3).pow(4)).add(mN.add(4).pow(5));
      if (p.isProbablePrime()) {
        return p;
      }
    }
  }
}
