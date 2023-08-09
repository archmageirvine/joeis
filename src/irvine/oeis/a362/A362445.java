package irvine.oeis.a362;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A362445 a(n) = (n+1)^4 written in base n.
 * @author Georg Fischer
 */
public class A362445 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    if (mN == 1) {
      return Z.valueOf(1111111111111111L);
    }
    if (mN >= 7) {
      return Z.valueOf(14641);
    }
    return new Z(Z.valueOf(mN + 1).pow(4).toString(mN));
  }
}
