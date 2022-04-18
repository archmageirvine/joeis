package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A059007 Numbers m such that m^2 reversed is a prime.
 * @author Georg Fischer
 */
public class A059007 implements Sequence {

  private int mN;
  private int mPow;

  /** Construct the sequence. */
  public A059007() {
    this(2);
  }

  /**
   * Generic constructor with parameters
   * @param pow raise n to this power
   */
  public A059007(final int pow) {
    mN = 0;
    mPow = pow;
  }

  @Override
  public Z next() {
    while (true) {
      if (ZUtils.reverse(Z.valueOf(++mN).pow(mPow)).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
