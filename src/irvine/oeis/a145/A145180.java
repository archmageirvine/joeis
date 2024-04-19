package irvine.oeis.a145;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A145180 Continued cotangent recurrence a(n+1) = a(n)^3 + 3*a(n) and a(1) = 6.
 * @author Georg Fischer
 */
public class A145180 extends Sequence1 {

  private int mN;
  private final Z mParm;
  private Z mA;

  /** Construct the sequence. */
  public A145180() {
    this(6);
  }

  /**
   * Generic constructor with parameter
   * @param parm initial value a(1)
   */
  public A145180(final int parm) {
    mN = 0;
    mParm = Z.valueOf(parm);
  }


  @Override
  public Z next() {
    ++mN;
    mA = mN == 1 ? mParm : mA.pow(3).add(mA.multiply(3));
    return mA;
  }
}
