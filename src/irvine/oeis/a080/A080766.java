package irvine.oeis.a080;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080766 A unitary phi reciprocal amicable number: consider two different numbers r, s which satisfy the following equation for some integer k: uphi(r) = uphi(s) = (1/k) * r * s / (r-s); or equivalently, 1/uphi(r) = 1/uphi(s) = k * (1/s - 1/r); sequence gives r numbers.
 * @author Sean A. Irvine
 */
public class A080766 extends Sequence1 {

  private long mN = 1;
  private long mM = 1;
  private long mU = 1;

  private boolean is(final long n, final long m) {
    final Z prod = Z.valueOf(n).multiply(m);
    if (prod.mod(n - m) != 0) {
      return false;
    }
    final Z t = prod.divide(n - m);
    if (t.mod(mU) != 0) {
      return false;
    }
    return mU == Functions.UPHI.l(m);
  }

  protected Z select(final long n, final long m) {
    return Z.valueOf(n);
  }

  @Override
  public Z next() {
    while (true) {
      if (++mM >= mN) {
        mU = Functions.UPHI.l(++mN);
        mM = 1;
      }
      if (is(mN, mM)) {
        return select(mN, mM);
      }
    }
  }
}
