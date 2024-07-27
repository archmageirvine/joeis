package irvine.oeis.a071;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071570 a(n) = 2 * Sum_{d|n} 2^mu(d).
 * @author Sean A. Irvine
 */
public class A071570 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.sumdiv(++mN, d -> Z.TWO.pow(1 + Functions.MOBIUS.l(d)));
  }
}

