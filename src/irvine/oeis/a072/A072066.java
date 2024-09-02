package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a005.A005179;
import irvine.oeis.a037.A037019;

/**
 * A072066 Exceptional (or extraordinary) numbers: m such that A005179(m) &lt; A037019(m).
 * @author Sean A. Irvine
 */
public class A072066 extends Sequence1 {

  private long mN = 0;
  private final Sequence mA = new A005179();
  private final Sequence mB = new A037019();

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (mA.next().compareTo(mB.next()) < 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
