package irvine.oeis.a087;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a037.A037153;

/**
 * A087202 a(n) is the smallest m such that m &gt; A037153(n) and n!+ m is prime.
 * @author Sean A. Irvine
 */
public class A087202 extends Sequence1 {

  private final Sequence mA = new A037153();
  private long mN = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    Z m = mA.next();
    final Z t = Functions.NEXT_PRIME.z(mF.add(m));
    return t.subtract(mF);
  }
}
