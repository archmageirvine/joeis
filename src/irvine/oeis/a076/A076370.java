package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A076370 a(n) is the smallest number k such that primorial(k)^2 &gt; primorial(n).
 * @author Sean A. Irvine
 */
public class A076370 extends Sequence0 {

  private long mM = 0;
  private long mN = -1;

  @Override
  public Z next() {
    final Z p = Functions.PRIMORIAL_COUNT.z(++mN);
    while (Functions.PRIMORIAL_COUNT.z(mM).square().compareTo(p) <= 0) {
      ++mM;
    }
    return Z.valueOf(mM);
  }
}
