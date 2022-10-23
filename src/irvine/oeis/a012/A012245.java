package irvine.oeis.a012;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A012245 Characteristic function of factorial numbers; also decimal expansion of Liouville's number or Liouville's constant.
 * @author Sean A. Irvine
 */
public class A012245 extends Sequence1 {

  private long mN = 0;
  private long mM = 1;
  private long mF = 1;

  @Override
  public Z next() {
    if (++mN == mF) {
      mF *= ++mM;
      return Z.ONE;
    }
    return Z.ZERO;
  }
}
