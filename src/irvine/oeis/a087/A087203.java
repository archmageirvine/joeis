package irvine.oeis.a087;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence3;
import irvine.oeis.a037.A037155;

/**
 * A087203 a(n) is the smallest m such that m &gt; A037155(n) and n! - m is prime.
 * @author Sean A. Irvine
 */
public class A087203 extends Sequence3 {

  private final Sequence mA = new A037155();
  private long mN = 2;
  private Z mF = Z.TWO;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    Z m = mA.next();
    final Z t = Functions.PREV_PRIME.z(mF.subtract(m));
    return mF.subtract(t);
  }
}
