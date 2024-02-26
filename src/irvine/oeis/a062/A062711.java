package irvine.oeis.a062;

import java.util.HashSet;

import irvine.math.group.GaussianIntegers;
import irvine.math.z.Z;
import irvine.math.zi.Zi;
import irvine.oeis.Sequence1;

/**
 * A062711 Number of prime Gaussian integers z=a+bi with |z|&lt;=n.
 * @author Sean A. Irvine
 */
public class A062711 extends Sequence1 {

  private static final GaussianIntegers G = GaussianIntegers.SINGLETON;
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final HashSet<Zi> primes = new HashSet<>();
    final long sq = (long) mN * mN;
    for (int x = -mN; x <= mN; ++x) {
      for (int y = -mN; y <= mN; ++y) {
        final Zi t = new Zi(x, y);
        if (G.abs(t).longValueExact() <= sq
          && G.isProbablePrime(t)
          //&& !primes.contains(t)
          && !primes.contains(G.negate(t))
          && !primes.contains(G.multiply(t, G.i()))
          && !primes.contains(G.negate(G.multiply(t, G.i())))
        ) {
          primes.add(t);
        }
      }
    }
    return Z.valueOf(primes.size());
  }
}
