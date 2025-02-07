package irvine.oeis.a075;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075072 a(1) = 1; for n &gt; 1, a(n) = n! divided by product of factorials of all prime divisors of n.
 * @author Sean A. Irvine
 */
public class A075072 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    Z f = Functions.FACTORIAL.z(++mN);
    for (final Z p : Jaguar.factor(mN).toZArray()) {
      f = f.divide(Functions.FACTORIAL.z(p));
    }
    return f;
  }
}

