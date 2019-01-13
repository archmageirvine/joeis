package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003143.
 * @author Sean A. Irvine
 */
public class A003143 implements Sequence {

  private int mN = -1;
  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(17 + 7 * (mN & 1)).shiftLeft(mN / 2).divide(14);
  }

}
