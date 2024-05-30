package irvine.oeis.a048;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A048669 The Jacobsthal function g(n): maximal gap in a list of all the integers relatively prime to n.
 * @author Sean A. Irvine
 */
public class A048669 extends Sequence1 {

  // After M. F. Hasler

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long l = 1;
    long m = 1;
    for (long k = 2; k <= mN + 1; ++k) {
      if (Functions.GCD.l(k, mN) > 1) {
        continue;
      }
      if (l + m < k) {
        m = k - l;
      }
      l = k;
    }
    return Z.valueOf(m);
  }
}
