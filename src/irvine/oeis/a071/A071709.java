package irvine.oeis.a071;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071709 Array A(i,j)= T(prime(i)^j) read by antidiagonals, where T(x) denote the "type" of the integer x: T(m)=1 or 2 depending on whether 1 or 2 is a descendant of n in the Half-totient tree.
 * @author Sean A. Irvine
 */
public class A071709 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;

  private Z t(final int n, final int m) {
    Z t = Functions.PRIME.z(n).pow(m);
    while (t.compareTo(Z.TWO) > 0) {
      t = Functions.PHI.z(t).divide2();
    }
    return t;
  }

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return t(mN - mM, mM + 1);
  }
}
