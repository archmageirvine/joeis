package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001788 <code>a(n) = n*(n+1)*2^(n-2)</code>.
 * @author Sean A. Irvine
 */
public class A001788 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).multiply(mN + 1).shiftLeft(mN - 2);
  }
}
