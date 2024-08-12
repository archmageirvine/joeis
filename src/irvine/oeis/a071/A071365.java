package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a046.A046523;

/**
 * A071365 Numbers k such that A071364(k) &lt;&gt; A046523(k).
 * @author Sean A. Irvine
 */
public class A071365 extends Sequence1 {

  private final Sequence mA071364 = new A071364();
  private final Sequence mA046523 = new A046523();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (!mA071364.next().equals(mA046523.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}
