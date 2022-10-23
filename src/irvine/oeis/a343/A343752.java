package irvine.oeis.a343;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A343752 a(1) = 1; for n &gt; 1, a(n) = n if a(n-1) is divisible by n, otherwise a(n) = a(n-1)+n.
 * @author Georg Fischer
 */
public class A343752 extends Sequence1 {

  private int mN;
  private Z mA;

  /** Construct the sequence. */
  public A343752() {
    mN = 0;
    mA = Z.ONE;
  }

  @Override
  public Z next() {
    ++mN;
    if (mN == 1) {
      return mA;
    }
    mA = mA.remainder(Z.valueOf(mN)).isZero() ? Z.valueOf(mN) : mA.add(mN);
    return mA;
  }
}
