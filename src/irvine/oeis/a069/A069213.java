package irvine.oeis.a069;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069213 a(n) = n-th positive integer relatively prime to n.
 * @author Sean A. Irvine
 */
public class A069213 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    long cnt = 0;
    while (true) {
      if (Functions.GCD.l(mN, ++k) == 1 && ++cnt == mN) {
        return Z.valueOf(k);
      }
    }
  }
}

