package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a002.A002808;

/**
 * A073432 Numbers n such that prime(n) + composite(n) is even.
 * @author Sean A. Irvine
 */
public class A073432 extends A000040 {

  private final Sequence mC = new A002808();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (mC.next().add(super.next()).isEven()) {
        return Z.valueOf(mN);
      }
    }
  }
}
