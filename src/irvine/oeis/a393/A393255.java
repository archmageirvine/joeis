package irvine.oeis.a393;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a059.A059261;

/**
 * A393255 Indices k where A059261(k)=A393253(k).
 * @author Sean A. Irvine
 */
public class A393255 extends Sequence1 {

  private final Sequence mA = new A059261();
  private final Sequence mB = new A393253();
  private long mN = -1;

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
