package irvine.oeis.a323;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A323861 Table read by antidiagonals where A(n,k) is the number of n X k aperiodic binary toroidal necklaces.
 * @author Gregory Morse
 */
public class A323861 extends Sequence1 {
  private int mN = 0;
  private int mK = 0;

  private static Z inclusionExclusion(final Z[] primes, final int k, final long index, final int n, final int m) {
    if (k == primes.length) {
      return Z.ONE.shiftLeft(index);
    }
    final long p = primes[k].longValueExact();
    final Z keep = inclusionExclusion(primes, k + 1, index, n, m);
    final Z line = inclusionExclusion(primes, k + 1, index / p, n, m);
    if (n % p == 0 && m % p == 0) {
      return keep.subtract(line.multiply(p + 1)).add(inclusionExclusion(primes, k + 1, index / p / p, n, m).multiply(p));
    }
    return keep.subtract(line);
  }

  protected static Z aperiodic(final int n, final int m) {
    // A translation subgroup fixes arrays constant on its cosets. In the p-torsion
    // plane there are p+1 lines of Moebius weight -1 and one plane of weight p.
    final long area = (long) n * m;
    return inclusionExclusion(Jaguar.factor(area).toZArray(), 0, area, n, m).divide(area);
  }

  @Override
  public Z next() {
    if (++mK > mN) {
      ++mN;
      mK = 1;
    }
    return aperiodic(mK, mN + 1 - mK);
  }
}
