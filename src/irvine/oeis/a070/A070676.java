package irvine.oeis.a070;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A070676 Smallest m in range 1..phi(n) such that 3^m == 1 mod n, or 0 if no such number exists.
 * @author Georg Fischer
 */
public class A070676 implements Sequence {

  private int mN;
  private Z mBase;

  /** Construct the sequence. */
  public A070676() {
    this(3);
  }

  /**
   * Generic constructor with parameter
   * @param base take this to the mth power
   */
  public A070676(final int base) {
    mN = 0;
    mBase = Z.valueOf(base);
  }

  @Override
  public Z next() {
    ++mN;
    int m = 1;
    final Z n = Z.valueOf(mN);
    final int lim = Euler.phi(Z.valueOf(mN)).intValue();
    while (m <= lim) {
      if (mBase.pow(m).mod(n).equals(Z.ONE)) {
        return Z.valueOf(m);
      }
      ++m;
    }
    return Z.ZERO;
  }
}
