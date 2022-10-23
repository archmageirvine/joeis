package irvine.oeis.a032;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A032742 a(1) = 1; for n &gt; 1, a(n) = largest proper divisor of n.
 * @author Sean A. Irvine
 */
public class A032742 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    final Z[] divisors = Jaguar.factor(mN).divisorsSorted();
    return divisors[divisors.length - 2];
  }
}
