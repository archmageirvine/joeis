package irvine.oeis.a037;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;

/**
 * A037136 Numbers k such that A037134(k) = A037135(k).
 * @author Sean A. Irvine
 */
public class A037136 extends Sequence1 {

  private final Sequence mA = new A037134();
  private final Sequence mB = new A037135();
  private long mN = 0;


  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (mA.next().equals(mB.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}
