package irvine.oeis.a006;

import java.util.ArrayList;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000139;

/**
 * A006402 Number of sensed 2-connected (nonseparable) planar maps with n edges.
 * @author Sean A. Irvine
 */
public class A006402 extends A000139 {

  /** Construct the sequence. */
  public A006402() {
    super(2);
  }

  private final ArrayList<Z> mB = new ArrayList<>();

  {
    mB.add(null);
    mB.add(super.next());
  }

  @Override
  public Z next() {
    final int n = mB.size();
    mB.add(super.next());
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(n).divisors()) {
      final int d = dd.intValue();
      if (d != n) {
        sum = sum.add(mB.get(d).multiply(Functions.PHI.l((long) (n / d))).multiply(9L * d * d - 9L * d + 2L));
      }
    }
    sum = sum.add(mB.get(n).multiply2()).divide(n);
    sum = sum.add((n & 1) == 0 ? mB.get(n / 2).multiply(3L * n - 4).divide(4) : mB.get((n + 1) / 2).multiply(n + 1));
    return sum.divide(4);
  }
}
