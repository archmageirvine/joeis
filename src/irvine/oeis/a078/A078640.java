package irvine.oeis.a078;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078640 Number of numbers between 1 and n-1 inclusive that are coprime to n*(n+1)*(n+2).
 * @author Sean A. Irvine
 */
public class A078640 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final Z t = Z.valueOf(++mN).multiply(mN + 1).multiply(mN + 2);
    long cnt = 0;
    for (long k = 1; k < mN; ++k) {
      if (Functions.GCD.l(t, k) == 1) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
