package irvine.oeis.a309;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A309892 a(0) = 0, a(1) = 1, and for any n &gt; 1, a(n) is the number of iterations of the map x -&gt; x - gpf(x) (where gpf(x) denotes the greatest prime factor of x) required to reach 0 starting from n.
 * @author Sean A. Irvine
 */
public class A309892 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    long m = ++mN;
    long cnt = 0;
    while (m != 0) {
      m -= Functions.GPF.l(m);
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}

