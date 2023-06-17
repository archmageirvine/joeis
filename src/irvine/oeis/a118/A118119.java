package irvine.oeis.a118;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A118119 Smallest integer m for which gcd(m^n + 1, (m+1)^n + 1) &gt; 1.
 * @author Georg Fischer
 */
public class A118119 extends AbstractSequence {

  private int mN;
  private int mAdd;

  /** Construct the sequence. */
  public A118119() {
    this(2, 1);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param add additive parameter
   */
  public A118119(final int offset, final int add) {
    super(2);
    mN = offset - 1;
    mAdd = add;
  }

  @Override
  public Z next() {
    ++mN;
    if (mN == 0) {
      return Z.ONE;
    }
    if (mN == 1) {
      return Z.ZERO;
    }
    Z m = Z.ZERO;
    while (true) {
      m = m.add(1);
      if (!m.pow(mN).add(mAdd).gcd(m.add(1).pow(mN).add(mAdd)).equals(Z.ONE)) {
        return m;
      }
    }
  }
}
