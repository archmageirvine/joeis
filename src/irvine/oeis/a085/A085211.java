package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A085211 Array A(x,y): concatenation of the binary expansions of x &amp; y in such a way that 'y' is inserted after the least significant 1-bit of 'x', followed by the remaining 0-bits, if any. Listed antidiagonalwise as A(0,0), A(1,0), A(0,1), A(2,0), A(1,1), A(0,2), ... Zero is expanded as an empty string.
 * @author Sean A. Irvine
 */
public class A085211 extends Sequence0 {

  private int mN = 0;
  private int mM = -1;

  protected Z t(final int n, final int m) {
    if (n == 0) {
      return Z.valueOf(m);
    }
    if (m == 0) {
      return Z.valueOf(n);
    }
    final Z odd = Z.valueOf(n).makeOdd();
    return new Z(odd.toString(2) + Long.toBinaryString(m) + "0".repeat((int) odd.auxiliary()), 2);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mN - mM, mM);
  }
}
