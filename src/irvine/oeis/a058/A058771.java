package irvine.oeis.a058;

import irvine.math.group.GaussianIntegers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Pair;

/**
 * A058771 Numbers k such that k * (1+i)^k - 1 is a Gaussian prime.
 * @author Sean A. Irvine
 */
public class A058771 implements Sequence {

  private static final GaussianIntegers G = GaussianIntegers.SINGLETON;
  private static final Pair<Z, Z> B = new Pair<>(Z.ONE, Z.ONE);
  private int mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Pair<Z, Z> candidate = G.subtract(G.multiply(G.pow(B, ++mN), G.coerce(mN)), G.one());
      //System.out.println(mN + " " + candidate);
      if (candidate.right().isZero() && candidate.left().abs().isProbablePrime()) {
        return Z.valueOf(mN);
      }
      if (G.isProbablePrime(candidate)) {
        return Z.valueOf(mN);
      }
    }
  }
}
