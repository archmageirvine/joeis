package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003683 <code>2^(n-1)*(2^n - (-1)^n)/3</code>.
 * @author Sean A. Irvine
 */
public class A003683 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.ONE.shiftLeft(mN).signedAdd((mN & 1) == 1, Z.ONE).divide(3).shiftLeft(mN - 1);
  }
}
