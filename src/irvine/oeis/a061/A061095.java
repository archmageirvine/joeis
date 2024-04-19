package irvine.oeis.a061;

import irvine.math.function.Functions;
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
    final int n = ++mN;
    final Z f = Functions.FACTORIAL.z(n);
    return Integers.SINGLETON.sumdiv(mN, d -> {
      return f.divide(Functions.FACTORIAL.z(mN / d).pow(d));
    });
  }
}
