package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;

/**
 * A064468 Positions of powers of 2 in A064413 (if it starts at 2).
 * @author Sean A. Irvine
 */
public class A064468 extends Sequence1 {

  private final Sequence mA = new A064413();
  private long mN = -1;
  private Z mM = Z.ONE;

  @Override
  public Z next() {
    mM = mM.multiply2();
    while (true) {
      ++mN;
      if (mA.next().equals(mM)) {
        return Z.valueOf(mN);
      }
    }
  }
}
