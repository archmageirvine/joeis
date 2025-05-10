package irvine.oeis.a078;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A078926 Number of primitive Pythagorean triangles with perimeter 2n.
 * @author Sean A. Irvine
 */
public class A078926 extends Sequence1 implements DirectSequence {

  protected long mN = 0;

  @Override
  public Z a(final Z n) {
    long c = 0;
    final Z lower = Functions.SQRT.z(n);
    final Z upper = Functions.SQRT.z(n.multiply2().subtract(1));
    for (final Z d : Jaguar.factor(n).divisors()) {
      if (d.isOdd() && lower.compareTo(d) < 0 && d.compareTo(upper) <= 0 && Functions.GCD.z(d, n.divide(d)).isOne()) {
        ++c;
      }
    }
    return Z.valueOf(c);
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

  @Override
  public Z next() {
    return a(Z.valueOf(++mN));
  }
}
