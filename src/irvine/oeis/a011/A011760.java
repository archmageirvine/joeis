package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A011760 Elevator buttons in U.S.A.: Positive integers except 13.
 * @author Sean A. Irvine
 */
public class A011760 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 13) {
      ++mN;
    }
    return Z.valueOf(mN);
  }
}
