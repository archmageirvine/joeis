package irvine.oeis.a000;

import java.util.ArrayList;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000111.
 * @author Sean A. Irvine
 */
public class A000111 implements Sequence {

  protected final ArrayList<Z> mA = new ArrayList<>();
  protected int mN = -1;

  @Override
  public Z next() {
    if (++mN < 3) {
      mA.add(Z.ONE);
      return Z.ONE;
    }
    if (mN < 0) {
      throw new UnsupportedOperationException();
    }
    Z sum = Z.ZERO;
    for (int k = 0; k < mN; ++k) {
      sum = sum.add(mA.get(k).multiply(mA.get(mN - 1 - k)).multiply(Binomial.binomial(mN - 1, k)));
    }
    sum = sum.divide2();
    mA.add(sum);
    return sum;
  }
}

