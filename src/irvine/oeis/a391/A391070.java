package irvine.oeis.a391;

import java.util.LinkedList;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a077.A077610;

/**
 * A391070 allocated for Geoffrey Critzer.
 * @author Sean A. Irvine
 */
public class A391070 extends Sequence1 {

  private long mN = 0;
  private final LinkedList<Z> mA = new LinkedList<>();

  // Irregular triangular array read by rows. T(n,k) is the number of integers in [n] that are multiples of the squarefree kernel of d but not divisible by a prime in the squarefree kernel of n/d where d is the k-th unitary divisor of n (as in A077610).

  @Override
  public Z next() {
    while (mA.isEmpty()) {
      for (final Z d : A077610.unitaryDivisors(++mN)) {
        final long kd = Functions.SQUARE_FREE_KERNEL.l(d);
        final long knd = Functions.SQUARE_FREE_KERNEL.l(mN / d.longValue());
        long cnt = 0;
        for (long k = kd; k <= mN; k += kd) {
          if (Functions.GCD.l(k, knd) == 1) {
            ++cnt;
          }
        }
        mA.add(Z.valueOf(cnt));
      }
    }
    return mA.pollFirst();
  }
}
