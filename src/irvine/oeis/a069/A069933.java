package irvine.oeis.a069;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069933 Number of k, 1&lt;=k&lt;=n, such that core(k) divides n, where core(x) is the squarefree part of x, the smallest integer such that x*core(x) is a square.
 * @author Sean A. Irvine
 */
public class A069933 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long count = 0;
    for (long k = 1; k <= mN; ++k) {
      if (mN % Functions.CORE.l(k) == 0) {
        ++count;
      }
    }
    return Z.valueOf(count);
  }
}
