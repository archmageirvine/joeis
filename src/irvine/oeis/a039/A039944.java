package irvine.oeis.a039;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A039944 Undulating palindromic primes of form ABABAB...BA with alternating prime and nonprime digits.
 * @author Sean A. Irvine
 */
public class A039944 implements Sequence {

  private static final long[] A = {2, 3, 5, 7};
  private static final long[] B = {0, 1, 4, 6, 8, 9};
  private int mN = 0;
  private final TreeSet<Z> mA = new TreeSet<>();
  {
    for (final long a : A) {
      for (final long b : B) {
        mA.add(Z.valueOf(a * 100 + b * 10 + a));
        if (b != 0) {
          mA.add(Z.valueOf(b * 100 + a * 10 + b));
        }
      }
    }
  }

  @Override
  public Z next() {
    // Handle single digit cases
    if (mN < A.length) {
      return Z.valueOf(A[mN++]);
    }
    // General case
    while (true) {
      final Z candidate = mA.pollFirst();
      // Add next digit for a future iteration
      mA.add(candidate.multiply(100).add(candidate.mod(100)));
      if (candidate.isProbablePrime()) {
        return candidate;
      }
    }
  }
}
