package irvine.oeis.a391;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A391055 a(n) is the number of iterations of x-&gt; gpf(3*x+1) starting at n until the value 2 is reached; a(n) = -1 if 2 is not reached.
 * @author Sean A. Irvine
 */
public class A391055 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z m = Z.valueOf(++mN);
    long cnt = 0;
    while (!m.equals(Z.TWO)) {
      m = Functions.GPF.z(m.multiply(3).add(1));
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}
