package irvine.oeis.a086;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A086793 Number of iterations of the map A034690 (x -&gt; sum of digits of all divisors of x) required to reach one of the fixed points, 15 or 1.
 * @author Sean A. Irvine
 */
public class A086793 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long m = ++mN;
    long cnt = 0;
    while (m != 1 && m != 15) {
      ++cnt;
      m = Integers.SINGLETON.sumdiv(m, Functions.DIGIT_SUM::z).longValueExact();
    }
    return Z.valueOf(cnt);
  }
}
