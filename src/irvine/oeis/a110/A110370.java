package irvine.oeis.a110;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A110370 Floor[ (digits n times n) divided by digits (n times 1)].
 * @author Georg Fischer
 */
public class A110370 implements Sequence {

  private int mN = 0;
  private final StringBuilder mDen = new StringBuilder();

  @Override
  public Z next() {
    ++mN;
    mDen.append(1);
    final StringBuilder num = new StringBuilder();
    final String sn = String.valueOf(mN);
    for (int k = 1; k <= mN; ++k) {
      num.append(sn);
    }
    return new Z(num.toString()).divide(new Z(mDen.toString()));
  }
}
