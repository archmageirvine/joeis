package irvine.oeis.a086;

import java.util.Arrays;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A086087 a(n) is the minimal m such that the group GL(m,3) has an element of order n.
 * @author Gregory Morse
 */
public class A086087 extends LambdaSequence {

  /** Construct the sequence. */
  public A086087() {
    super(2, n -> Z.valueOf(dimension(n)));
  }

  private static long dimension(final long n) {
    final FactorSequence fs = Jaguar.factor(n);
    final Z[] primes = fs.toZArray();
    final long[] costs = new long[1 << primes.length];
    for (int s = 1; s < costs.length; ++s) {
      long semisimple = 1;
      long blockSize = 1;
      for (int j = 0; j < primes.length; ++j) {
        if ((s & (1 << j)) != 0) {
          final Z p = primes[j];
          final int e = fs.getExponent(p);
          if (Z.THREE.equals(p)) {
            blockSize = p.pow(e - 1).longValueExact() + 1;
          } else {
            semisimple *= p.pow(e).longValueExact();
          }
        }
      }
      final long degree = semisimple == 1 ? 1 : Functions.ORDER.l(semisimple, 3);
      costs[s] = blockSize * degree;
    }
    final long[] best = new long[costs.length];
    Arrays.fill(best, Long.MAX_VALUE);
    best[0] = 0;
    // Assign each full prime power to one primary block attaining it.
    for (int s = 1; s < best.length; ++s) {
      final int first = Integer.lowestOneBit(s);
      for (int t = s; t != 0; t = (t - 1) & s) {
        if ((t & first) != 0 && costs[t] < best[s] - best[s ^ t]) {
          best[s] = costs[t] + best[s ^ t];
        }
      }
    }
    return best[best.length - 1];
  }
}
