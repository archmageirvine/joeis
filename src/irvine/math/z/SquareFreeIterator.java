package irvine.math.z;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

import irvine.factor.prime.Fast;
import irvine.util.AbstractIterator;

/**
 * Iterate over square-free integers with specified number of primes
 * and least value in numerical order
 * @author Sean A. Irvine
 */
public final class SquareFreeIterator extends AbstractIterator<Z> {

  private final Fast mPrime = new Fast();
  private final TreeMap<Z, Z[]> mPriority = new TreeMap<>();

  /**
   * Construct a new square free integer iterator.
   * @param numberPrimeFactors exact number of prime factors in numbers
   * @param startPrime smallest prime in the numbers
   */
  public SquareFreeIterator(final int numberPrimeFactors, final long startPrime) {
    final Z[] tuple = new Z[numberPrimeFactors];
    Z prod = Z.ONE;
    Z p = Z.valueOf(mPrime.nextPrime(startPrime - 1));
    for (int k = 0; k < numberPrimeFactors; ++k) {
      tuple[k] = p;
      prod = prod.multiply(p);
      p = mPrime.nextPrime(p);
    }
    mPriority.put(prod, tuple);
  }

  @Override
  public boolean hasNext() {
    return true; // There's an infinite number of values ...
  }

  @Override
  public Z next() {
    final Map.Entry<Z, Z[]> first = mPriority.pollFirstEntry();
    final Z res = first.getKey();
    final Z[] tuple = first.getValue();
    final Z[] tLast = Arrays.copyOf(tuple, tuple.length);
    final int m = tuple.length - 1;
    tLast[m] = mPrime.nextPrime(tLast[m]);
    mPriority.put(res.divide(tuple[m]).multiply(tLast[m]), tLast);
    for (int k = 0; k < m; ++k) {
      final Z np = mPrime.nextPrime(tuple[k]);
      if (np.compareTo(tuple[k + 1]) < 0) {
        final Z[] tk = Arrays.copyOf(tuple, tuple.length);
        tk[k] = np;
        mPriority.put(res.divide(tuple[k]).multiply(np), tk);
      }
    }
    return res;
  }

  /**
   * Iterate over square free integers.
   * @param args number of prime factors, smallest prime factor
   */
  public static void main(final String[] args) {
    final SquareFreeIterator sfi = new SquareFreeIterator(Integer.parseInt(args[0]), Long.parseLong(args[1]));
    while (true) {
      System.out.println(sfi.next());
    }
  }

}
