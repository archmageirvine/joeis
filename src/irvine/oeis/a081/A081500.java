package irvine.oeis.a081;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081500 In a triangle the n-th row begins with n and contains n-1 smallest numbers coprime to n and greater than n. Sequence gives the leading diagonal.
 * @author Sean A. Irvine
 */
public class A081500 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long s = ++mN + 1;
    long k = s;
    while (k < 2 * mN) {
      if (Functions.GCD.l(s, mN) == 1) {
        ++k;
      }
      ++s;
    }
    return Z.valueOf(s - 1);
  }
}
