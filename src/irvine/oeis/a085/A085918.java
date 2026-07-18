package irvine.oeis.a085;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A085918 Primes p such that for some k the number of terms &gt; 0 and &lt; 1 in the Farey sequence of order k is p.
 * @author Sean A. Irvine
 */
public class A085918 extends Sequence1 {

  private long mN = 1;
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mSum = mSum.add(Functions.PHI.l(++mN));
      if (mSum.isProbablePrime()) {
        return mSum;
      }
    }
  }
}
