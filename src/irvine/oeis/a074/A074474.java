package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000244;

/**
 * A074474 Number of iteration that first becomes smaller than the initial value if Collatz-function (A006370) is iterated, starting with numbers of form 4n+3.
 * @author Sean A. Irvine
 */
public class A074474 extends A000244 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z s = Z.valueOf(4 * ++mN - 1);
    long cnt = 1;
    Z m = s;
    while (m.compareTo(s) >= 0) {
      m = Functions.COLLATZ.z(m);
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}

