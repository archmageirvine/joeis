package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010552 Multiply successively by <code>1</code> (once), <code>2</code> (twice), <code>3</code> (thrice), etc.
 * @author Sean A. Irvine
 */
public class A010552 implements Sequence {

  private Z mA = Z.ONE;
  private long mN = 1;
  private long mM = 3;

  @Override
  public Z next() {
    if (--mM == 0) {
      ++mN;
      mM = mN;
    }
    mA = mA.multiply(mN);
    return mA;
  }
}
