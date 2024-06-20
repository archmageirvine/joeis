package irvine.oeis.a032;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A032742 a(1) = 1; for n &gt; 1, a(n) = largest proper divisor of n (that is, for n&gt;1, maximum divisor d of n in range 1 &lt;= d &lt; n).
 * @author Sean A. Irvine
 */
public class A032742 extends Sequence1 implements DirectSequence {

  private int mN = 0;

  @Override
  public Z next() {
    return a(++mN);
  }

  @Override
  public Z a(final Z n) {
    if (n.compareTo(Z.ONE) <= 0) {
      return Z.ONE;
    }
    final Z[] divisors = Jaguar.factor(n).divisorsSorted();
    return divisors[divisors.length - 2];
  }

  @Override
  public Z a(final int n) {
    if (n <= 1) {
      return Z.ONE;
    }
    final Z[] divisors = Jaguar.factor(n).divisorsSorted();
    return divisors[divisors.length - 2];
  }

}
