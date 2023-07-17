package irvine.oeis.a006;

import java.util.ArrayList;

import irvine.math.z.Binomial;
import irvine.math.z.Z;

/**
 * A006854 Nonantipodal balanced colorings of n-cube.
 * @author Sean A. Irvine
 */
public class A006854 extends A006853 {

  /** Construct the sequence. */
  public A006854() {
    super(1);
  }

  private int mN = 0;

  @Override
  public Z next() {
    if (++mN <= 2) {
      return Z.ONE;
    }
    Z sum = Z.ONE; // A_{n,0} = 1
    final ArrayList<Z> prev = new ArrayList<>();
    prev.add(Z.ONE);
    for (int k = 1; k <= (1L << mN) / 4; ++k) {
      Z t = bigN(mN, 2 * k);
      for (int i = 0; i < k; ++i) {
        t = t.subtract(Binomial.binomial((1L << (mN - 1)) - 2 * i, k - i).multiply(prev.get(i)));
      }
      prev.add(t);
      sum = sum.add(t);
    }
    return sum;
  }
}
