package irvine.oeis.a056;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a010.A010048;

/**
 * A056588 Coefficient triangle of certain polynomials.
 * @author Sean A. Irvine
 */
public class A056588 extends A010048 {

  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    if (mM == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int j = 1; j <= mM; ++j) {
      sum = sum.signedAdd((((j + 1) / 2) & 1) == 0, Functions.FIBONACCI.z((long) (mM + 1 - j)).pow(mN + 1).multiply(get(mN + 2, j)));
    }
    return sum.add(Functions.FIBONACCI.z((long) (mM + 1)).pow(mN + 1));
  }
}

