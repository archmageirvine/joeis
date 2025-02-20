package irvine.oeis.a075;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A075482 Number of iteration that first becomes smaller than the initial value if Collatz-function (A006370) is iterated, starting with numbers of the form 64n + 59.
 * @author Sean A. Irvine
 */
public class A075482 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final Z s = Z.valueOf(64 * ++mN + 59);
    long cnt = 1;
    Z m = s;
    while (m.compareTo(s) >= 0) {
      m = Functions.COLLATZ.z(m);
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}

