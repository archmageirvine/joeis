package irvine.oeis.a075;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A075481 Number of iteration that first becomes smaller than the initial value if Collatz-function (A006370) is iterated, starting with numbers of form 64n+47. Corresponds to selection of every 16th term from A074474.
 * @author Sean A. Irvine
 */
public class A075481 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final Z s = Z.valueOf(64 * ++mN + 47);
    long cnt = 1;
    Z m = s;
    while (m.compareTo(s) >= 0) {
      m = Functions.COLLATZ.z(m);
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}

