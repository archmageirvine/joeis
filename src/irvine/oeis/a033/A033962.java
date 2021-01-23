package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033962 Trajectory of 1 under map n-&gt;9n+1 if n odd, n-&gt;n/2 if n even.
 * @author Sean A. Irvine
 */
public class A033962 implements Sequence {

  private Z mA;
  private Z mStart;
  private Z mFactor;

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
