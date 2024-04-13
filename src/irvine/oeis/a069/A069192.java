package irvine.oeis.a069;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069192 Sum of the reversals of the divisors of n.
 * @author Sean A. Irvine
 */
public class A069192 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.sumdiv(++mN, Functions.REVERSE::z);
  }
}

