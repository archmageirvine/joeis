package irvine.oeis.a107;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A107668 Column 0 of triangle A107667.
 * @author Georg Fischer
 */
public class A107668 extends Sequence0 {

  private final ArrayList<Z> mScaled = new ArrayList<>();
  private Z mFactorial = Z.ONE;

  @Override
  public Z next() {
    final int m = mScaled.size() + 1;
    mFactorial = mFactorial.multiply(m);
    final Z square = Z.valueOf(m).square();
    Z binomial = Z.ONE;
    Z power = Z.ONE;
    Z sum = Z.ZERO;
    // Clear the common denominator m! before applying the recurrence.
    for (int k = 1; k < m; ++k) {
      binomial = binomial.multiply(m - k + 1).divide(k);
      power = power.multiply(square);
      sum = sum.add(binomial.multiply(power).multiply(mScaled.get(m - k - 1)));
    }
    final Z numerator = power.multiply(square).subtract(sum);
    final Z t = numerator.divide(numerator.gcd(mFactorial));
    mScaled.add(t.multiply(mFactorial));
    return t;
  }
}
