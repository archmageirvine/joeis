package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.a000.A000244;

/**
 * A051640 a(n) contains the digit b-1 in all bases b from 2 to n.
 * @author Sean A. Irvine
 */
public class A051640 extends A000244 {

  /** Construct the sequence. */
  public A051640() {
    super(2);
  }

  private long mN = 1;
  private long mM = 1;

  private boolean isOk(final long n, final long b) {
    long m = n;
    while (m != 0) {
      if (m % b == b - 1) {
        return true;
      }
      m /= b;
    }
    return false;
  }

  private boolean is(final long n, final long b) {
    for (long k = b; k >= 2; --k) {
      if (!isOk(n, k)) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    ++mN;
    while (!is(mM, mN)) {
      ++mM;
    }
    return Z.valueOf(mM);
  }
}
