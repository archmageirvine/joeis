package irvine.oeis.a224;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A224752 a(1)=1; thereafter a(n) = smallest number m such that a(n-1)+m = (a(n-1) followed by the leading digit of m).
 * @author Georg Fischer
 */
public class A224752 implements Sequence {

  private int mN;
  private Z mA;

  /** Construct the sequence. */
  public A224752() {
    this(1);
  }

  /**
   * Generic constructor with parameters
   * @param start first term
   */
  public A224752(final int start) {
    mN = 0;
    mA = Z.valueOf(start);
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      return mA;
    }
    Z m = mA.multiply(9);
    while (!mA.add(m).equals(mA.multiply(Z.TEN).add(m.toString().charAt(0) - '0'))) {
      m = m.add(1);
    }
    mA = m;
    return m;
  }
}
