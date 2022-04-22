package irvine.oeis.a070;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A070681 Smallest m in range 1..phi(2n+1) such that 6^m == 1 mod 2n+1, or 0 if no such number exists.
 * @author Georg Fischer
 */
public class A070681 implements Sequence {

  private int mN;
  private final Z mBase;

  /** Construct the sequence. */
  public A070681() {
    this(6);
  }

  /**
   * Generic constructor with parameter
   * @param base base of power
   */
  public A070681(final int base) {
    mN = -1;
    mBase = Z.valueOf(base);
  }

  @Override
  public Z next() {
    ++mN;
    int m = 1;
    final Z n21 = Z.valueOf(2L * mN + 1);
    final int lim = Euler.phi(n21).intValue();
    while (m <= lim) {
      if (mBase.pow(m).mod(n21).equals(Z.ONE)) {
        return Z.valueOf(m);
      }
      ++m;
    }
    return Z.ZERO;
  }
}
