package irvine.oeis.a085;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A085430 Least dimension of a binary general linear group containing an element of order n.
 * @author Gregory Morse
 */
public class A085430 extends LambdaSequence {

  private static Z dimension(final long n) {
    final FactorSequence fs = Jaguar.factor(n);
    final Z[] primes = fs.toZArray();
    final Z[] powers = new Z[primes.length];
    for (int k = 0; k < primes.length; ++k) {
      powers[k] = primes[k].pow(fs.getExponent(primes[k]));
    }
    final int size = 1 << powers.length;
    final Z[] cost = new Z[size];
    final Z[] best = new Z[size];
    best[0] = Z.ZERO;
    for (int s = 1; s < size; ++s) {
      Z odd = Z.ONE;
      Z block = Z.ONE;
      for (int k = 0; k < powers.length; ++k) {
        if ((s & (1 << k)) != 0) {
          if (primes[k].isEven()) {
            block = powers[k].divide2().add(1);
          } else {
            odd = odd.multiply(powers[k]);
          }
        }
      }
      // One primary block realizes these full prime powers.
      cost[s] = odd.isOne() ? block : block.multiply(Functions.ORDER.z(odd, Z.TWO));
      Z min = cost[s];
      for (int t = (s - 1) & s; t != 0; t = (t - 1) & s) {
        if ((t & -s & s) != 0) {
          min = min.min(cost[t].add(best[s ^ t]));
        }
      }
      best[s] = min;
    }
    return best[size - 1];
  }

  /** Construct the sequence. */
  public A085430() {
    super(2, A085430::dimension);
  }
}
