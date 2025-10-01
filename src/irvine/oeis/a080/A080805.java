package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a071.A071221;
import irvine.oeis.a072.A072475;

/**
 * A080805 Numbers n such that A072475(n) divides A071221(n).
 * @author Sean A. Irvine
 */
public class A080805 extends Sequence1 {

  private final Sequence mA = new A072475();
  private final Sequence mB = new A071221();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (mB.next().mod(mA.next()).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
