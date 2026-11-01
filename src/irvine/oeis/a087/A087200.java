package irvine.oeis.a087;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a005.A005235;

/**
 * A087200 a(n) is the smallest m such that m &gt; A005235(n) and A002110(n)+m is prime.
 * @author Sean A. Irvine
 */
public class A087200 extends A005235 {

  private long mN = 0;

  @Override
  public Z next() {
    Z m = super.next();
    final Z p = Functions.PRIMORIAL_COUNT.z(++mN);
    final Z t = Functions.NEXT_PRIME.z(p.add(m));
    return t.subtract(p);
  }
}
