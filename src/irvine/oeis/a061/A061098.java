package irvine.oeis.a061;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061098 Concatenation of all numbers less than or equal to n other than the phi(n) numbers relatively prime to n.
 * @author Sean A. Irvine
 */
public class A061098 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    final StringBuilder sb = new StringBuilder();
    for (long k = 2; k <= mN; ++k) {
      if (Functions.GCD.l(k, mN) != 1) {
        sb.append(k);
      }
    }
    return new Z(sb);
  }
}
