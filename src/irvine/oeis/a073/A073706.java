package irvine.oeis.a073;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073706 a(n) = Sum_{ d divides n } (n/d)^(3d).
 * @author Sean A. Irvine
 */
public class A073706 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sumdiv(mN, d -> Z.valueOf(d).pow(3L * mN / d));
  }
}
