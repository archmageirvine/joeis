package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003674 <code>2^(n-1)*( 2^n - (-1)^n )</code>.
 * @author Sean A. Irvine
 */
public class A003674 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.ONE.shiftLeft(mN).signedAdd((mN & 1) == 1, Z.ONE).shiftLeft(mN - 1);
  }
}
