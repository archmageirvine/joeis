package irvine.oeis.a165;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A165471 Legendre symbol (n,65537).
 * @author Georg Fischer
 */
public class A165471 extends Sequence0 {

  private int mN = -1;
  private long mParm;

  /** Construct the sequence. */
  public A165471() {
    this(65537);
  }

  /**
   * Generic constructor with parameters
   * @param parm compute the Legendre symbol for this number
   */
  public A165471(final long parm) {
    mN = -1;
    mParm = parm;
  }

  @Override
  public Z next() {
    return Z.valueOf(LongUtils.jacobi(++mN, mParm));
  }
}
