package irvine.oeis.a337;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A337949 a(n) = 2^(n*(n-1)/2) + 2^(n*(n+1)/2) for n &gt; 0, with a(0) = 1.
 * @author Georg Fischer
 */
public class A337949 extends Sequence0 {

  private int mN;
  private final Z mBase;

  /** Construct the sequence. */
  public A337949() {
    this(2);
  }

  /**
   * Generic constructor with parameters
   * @param base
   */
  public A337949(final int base) {
    mN = -1;
    mBase = Z.valueOf(base);
  }

  @Override
  public Z next() {
    ++mN;
    return mN == 0 ? Z.ONE : mBase.pow(((long) mN * (mN - 1)) / 2).add(mBase.pow(((long) mN * (mN + 1)) / 2));
  }
}
