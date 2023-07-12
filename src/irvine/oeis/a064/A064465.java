package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a034.A034444;
import irvine.oeis.a048.A048138;

/**
 * A064465 Numbers k such that A048138(k) = A034444(k).
 * @author Sean A. Irvine
 */
public class A064465 extends Sequence1 {

  private final Sequence mA = new A048138();
  private final Sequence mB = new A034444();
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
