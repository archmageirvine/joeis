package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A033962 Trajectory of 1 under map n-&gt;9n+1 if n odd, n-&gt;n/2 if n even.
 * @author Sean A. Irvine
 */
public class A033962 extends Sequence0 {

  private Z mA;
  private final Z mStart;
  private final Z mFactor;

  /** 
   * Empty constructor
   */
  public A033962() {
    mA = null;
    mStart = Z.ONE;
    mFactor = Z.NINE;
  }

  /** 
   * Constructor with parameters
   * @param start starting value
   * @param factor factor of n
   */
  public A033962(final long start, final long factor) {
    mStart = Z.valueOf(start);
    mFactor = Z.valueOf(factor);
  }

  @Override
  public Z next() {
    mA = mA == null ? mStart : mA.isEven() ? mA.divide2() : mA.multiply(mFactor).add(1);
    return mA;
  }
}
