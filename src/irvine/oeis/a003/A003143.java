package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003143 <code>a(2*n) = floor( 17*2^n/14 ), a(2*n+1) = floor( 12*2^n/7 )</code>.
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
