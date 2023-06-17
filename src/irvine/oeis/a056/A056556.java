package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A056556 First tetrahedral coordinate; repeat m (m+1)*(m+2)/2 times.
 * @author Sean A. Irvine
 */
public class A056556 extends AbstractSequence {

  /* Construct the sequence. */
  public A056556() {
    super(0);
  }

  private long mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    if (--mM < 0) {
      ++mN;
      mM = (mN + 1) * (mN + 2) / 2 - 1;
    }
    return Z.valueOf(mN);
  }
}
