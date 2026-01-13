package irvine.oeis.a083;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083165 a(n) = (Sum of the terms of A083164 with index which are the divisors of n ) /n.
 * @author Sean A. Irvine
 */
public class A083165 extends Sequence1 {

  private final A083164 mA = new A083164();
  private int mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.sumdiv(++mN, mA::a).divide(mN);
  }
}

