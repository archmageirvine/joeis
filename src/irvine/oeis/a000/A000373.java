package irvine.oeis.a000;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;

/**
 * A000373 Conjectured dimension of a module associated with the free commutative Moufang loop with n generators.
 * @author Sean A. Irvine
 */
public class A000373 extends A000275 {

  /** Construct the sequence. */
  public A000373() {
    super(1);
  }

  {
    super.next();
  }


  private Z a(final int n) {
    return n == 1 ? Z.ZERO : mA.get(n);
  }

  @Override
  public Z next() {
    super.next();
    Z sum = Z.ZERO;
    final Z nf = Functions.FACTORIAL.z(mN);
    for (int k = 1; k <= (mN - 1) / 2; ++k) {
      final Z f2k = Functions.FACTORIAL.z(2 * k + 1);
      for (int p = 0; p <= mN - 2 * k - 1; ++p) {
        sum = sum.add(a(k).add(Binomial.binomial(p + k - 1, k - 1))
                      .multiply(nf)
                      .divide(Functions.FACTORIAL.z(p))
                      .divide(f2k)
                      .divide(Functions.FACTORIAL.z(mN - p - 2 * k - 1)));
      }
    }
    return sum;
  }
}
