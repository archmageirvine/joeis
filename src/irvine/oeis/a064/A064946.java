package irvine.oeis.a064;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064946 a(n) = Sum_{i|n, j|n, j&gt;i} j.
 * @author Sean A. Irvine
 */
public class A064946 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z[] divisors = Jaguar.factor(++mN).divisorsSorted();
    return Integers.SINGLETON.sum(0, divisors.length - 1, k -> divisors[k].multiply(k));
  }
}
