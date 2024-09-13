package irvine.oeis.a072;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.math.MemoryFunction;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072183 Sequence arising from factorization of the Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A072183 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private int mN = 0;

  private final MemoryFunction<Integer, Z> mA = new MemoryFunction<>() {
    private Z b(final int n) {
      final Z[] div = Jaguar.factor(n).divisorsSorted();
      Z prod = Z.ONE;
      for (int k = 0; k < div.length - 1; ++k) {
        prod = prod.multiply(getValue(div[k].intValue() * ((n & 1) == 0 ? 1 : 2)));
      }
      return prod;
    }

    private Z c(final int n) {
      final Z[] div = Jaguar.factor(n).divisorsSorted();
      Z prod = Z.ONE;
      for (int k = 0; k < div.length; ++k) {
        if (k != div.length - 2) {
          prod = prod.multiply(getValue(div[k].intValue()));
        }
      }
      return prod;
    }

    @Override
    protected Z compute(final Integer n) {
      if (n <= 2) {
        return Z.ONE;
      } else if (mPrime.isPrime(n)) {
        return Functions.LUCAS.z(n);
      } else if ((n & 3) == 2 && mPrime.isPrime(n / 2)) {
        return Functions.FIBONACCI.z(n / 2);
      } else if ((n & 1) == 0) {
        return Functions.FIBONACCI.z(n).divide(b(n));
      } else {
        put(2 * n, Functions.FIBONACCI.z(n).divide(b(n)));
        return Functions.FIBONACCI.z(2 * n).divide(c(2 * n));
      }
    }
  };

  @Override
  public Z next() {
    return mA.getValue(++mN);
  }
}
