package irvine.oeis.a333;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A333523 Number of iterations of Reverse And Add needed to reach a number divisible by n (or 0 if such a number is never reached).
 * @author Sean A. Irvine
 */
public class A333523 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z a = Z.valueOf(++mN);
    long k = 0;
    while (true) {
      ++k;
      a = Functions.REVERSE.z(a).add(a);
      if (a.mod(mN) == 0) {
        return Z.valueOf(k);
      }
    }
  }
}
