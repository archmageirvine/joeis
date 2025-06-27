package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a006.A006530;

/**
 * A078327 Numbers k such that A078142(k) = A006530(k).
 * @author Sean A. Irvine
 */
public class A078327 extends Sequence1 {

  private final Sequence mA = new A078142();
  private final Sequence mB = new A006530();
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

