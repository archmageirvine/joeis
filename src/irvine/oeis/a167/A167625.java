package irvine.oeis.a167;

import irvine.math.z.Z;
import irvine.oeis.a333.A333330;

/**
 * A167625 Square array T(n,k), read by upward antidiagonals, counting isomorphism classes of k-regular multigraphs of order n, loops allowed.
 * @author Gregory Morse
 */
public class A167625 extends A333330 {
  private int mN = 1;
  private int mK = -1;

  /** Construct the sequence. */
  public A167625() {
    super(true, false);
    setOffset(1);
  }

  @Override
  public Z next() {
    if (++mK >= mN) {
      ++mN;
      mK = 0;
    }
    return t(mN - mK, mK);
  }
}
