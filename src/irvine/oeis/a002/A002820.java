package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a005.A005327;

/**
 * A002820 Number of n X n invertible binary matrices A such that A+I is invertible.
 * @author Sean A. Irvine
 */
public class A002820 extends Sequence0 {

  private final Sequence mA = new A005327();
  private int mN = -1;

  @Override
  public Z next() {
    return mA.next().shiftLeft((long) ++mN * (mN - 1) / 2);
  }
}
