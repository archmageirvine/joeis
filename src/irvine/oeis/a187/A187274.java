package irvine.oeis.a187;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A187274 <code>a(n) = n*4^(n/2 - 1)*(9 + (-1)^n)</code>.
 * @author Sean A. Irvine
 */
public class A187274 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).multiply((mN & 1) == 0 ? 10 : 8).shiftLeft(mN - 2);
  }
}
