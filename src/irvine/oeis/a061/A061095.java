package irvine.oeis.a061;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061095 Number of ways of dividing n labeled items into labeled boxes with an equal number of items in each box.
 * @author Sean A. Irvine
 */
public class A061095 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final Z f = MemoryFactorial.SINGLETON.factorial(++mN);
    return Integers.SINGLETON.sumdiv(mN, d -> f.divide(MemoryFactorial.SINGLETON.factorial(mN / d).pow(d)));
  }
}
