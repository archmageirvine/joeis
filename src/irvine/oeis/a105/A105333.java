package irvine.oeis.a105;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A105333 a(n) = n*(n+1)/2 mod 16.
 * @author Georg Fischer
 */
public class A105333 extends Sequence0 {

  private int mN;
  private Z mMod;

  /** Construct the sequence. */
  public A105333() {
    this(16);
  }

  /**
   * Generic constructor with parameters
   * @param mod
   */
  public A105333(final int mod) {
    mN = -1;
    mMod = Z.valueOf(mod - 1);
  }

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN).multiply(mN + 1).divide2().and(mMod);
  }
}
