package irvine.oeis.a058;

import irvine.math.group.GaussianIntegers;
import irvine.math.z.Z;
import irvine.math.zi.Zi;
import irvine.oeis.Sequence1;

/**
 * A058770 Numbers k such that k * (1+i)^k + 1 is a Gaussian prime.
 * @author Sean A. Irvine
 */
public class A058770 extends Sequence1 {

  private static final GaussianIntegers G = GaussianIntegers.SINGLETON;
  private static final Zi B = new Zi(Z.ONE, Z.ONE);
  private int mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Zi candidate = G.add(G.multiply(G.pow(B, ++mN), G.coerce(mN)), G.one());
      if (G.isProbablePrime(candidate)) {
        return Z.valueOf(mN);
      }
    }
  }
}
