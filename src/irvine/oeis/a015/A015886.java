package irvine.oeis.a015;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A015886 a(n) = smallest number k such that sigma(k + n) = sigma(k) + n, or -1 if no such number exists.
 * @author Sean A. Irvine
 */
public class A015886 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    while (true) {
      ++k;
      if (Functions.SIGMA.z(mN + k).equals(Functions.SIGMA.z(k).add(mN))) {
        return Z.valueOf(k);
      }
    }
  }
}

