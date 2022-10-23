package irvine.oeis.a051;
// manually 2021-08-04

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A051037 5-smooth numbers, i.e., numbers whose prime divisors are all &lt;= 5.
 * @author Georg Fischer
 */
public class A051037 extends Sequence1 {

  private final TreeSet<Z> mPriority = new TreeSet<>();
  protected final int[] mPrimes;
  
  /** Construct the sequence. */
  public A051037() {
    this(new int[] { 2, 3, 5 });
  }

  /**
   * Generic Constructor with parameter
   * @param primes list of primes
   */
  protected A051037(final int[] primes) {
    mPrimes = primes;
    mPriority.add(Z.ONE);
  }
  
  @Override
  public Z next() {
    final Z r = mPriority.pollFirst();
    for (int i : mPrimes) {
      mPriority.add(r.multiply(i));
    }
    return r;
  }
}
