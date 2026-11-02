package irvine.oeis.a087;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence3;
import irvine.oeis.a055.A055211;

/**
 * A087201 a(n) is the smallest m such that m &gt; A055211(n) and A002110(n)-m is prime.
 * @author Sean A. Irvine
 */
public class A087201 extends Sequence3 {

  private final Sequence mA = new A055211().skip();
  private long mN = 2;

  @Override
  public Z next() {
    final Z m = mA.next();
    final Z p = Functions.PRIMORIAL_COUNT.z(++mN);
    final Z t = Functions.PREV_PRIME.z(p.subtract(m));
    return p.subtract(t);
  }
}
