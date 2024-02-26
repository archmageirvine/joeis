package irvine.oeis.a058;

import irvine.math.group.GaussianIntegers;
import irvine.math.z.Z;
import irvine.math.zi.Zi;
import irvine.oeis.Sequence1;

/**
 * A058772 Numbers k such that k * (1+i)^k - i is a Gaussian prime.
 * @author Sean A. Irvine
 */
public class A058772 extends Sequence1 {

  private static final GaussianIntegers G = GaussianIntegers.SINGLETON;
  private static final Zi B = new Zi(Z.ONE, Z.ONE);
  private int mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Zi candidate = G.subtract(G.multiply(G.pow(B, ++mN), G.coerce(mN)), G.i());
      if (G.isProbablePrime(candidate)) {
        return Z.valueOf(mN);
      }
    }
  }
}
