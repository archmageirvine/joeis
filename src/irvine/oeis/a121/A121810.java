package irvine.oeis.a121;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A121810 a(n) = a(n - 1)*a(n - 2) + a(n - 2)*a(n - 3) + a(n - 1)*a(n - 3).
 * @author Georg Fischer
 */
public class A121810 extends AbstractSequence {

  private int mN;
  private Z[] mA;
  private static final int MASK = 0b11;

  /** Construct the sequence. */
  public A121810() {
    super(-1);
    mA = new Z[]{Z.ONE, Z.ONE, Z.ZERO, Z.ZERO};
    mN = -1;
  }

  private Z f(final Z x, final Z y, final Z z) {
    return y.multiply(z).add(z.multiply(x)).add(x.multiply(y));
  }

  @Override
  public Z next() {
    ++mN;
    if (mN < 3) {
      return mA[mN];
    }
    final Z result = f(mA[(mN + 3) & MASK], mA[(mN + 2) & MASK], mA[(mN + 1) & MASK]);
    mA[mN & MASK] = result;
    return result;
  }
}
