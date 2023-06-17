package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A001044 a(n) = (n!)^2.
 * @author Sean A. Irvine
 */
public class A001044 extends AbstractSequence {

  /* Construct the sequence. */
  public A001044() {
    super(0);
  }

  private Z mF = null;
  private long mN = 0;

  @Override
  public Z next() {
    if (mF == null) {
      mF = Z.ONE;
    } else {
      mF = mF.multiply(Z.valueOf(++mN).square());
    }
    return mF;
  }
}
