package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002446 <code>2^(2n+1) - 2</code>.
 * @author Sean A. Irvine
 */
public class A002446 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    mN += 2;
    return Z.ONE.shiftLeft(mN).subtract(2);
  }
}
