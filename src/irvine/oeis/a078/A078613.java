package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a005.A005089;
import irvine.oeis.a005.A005091;

/**
 * A078613 Same numbers of distinct prime factors of forms 4*k+1 and 4*k+3.
 * @author Sean A. Irvine
 */
public class A078613 extends Sequence1 {

  private final Sequence mA = new A005089();
  private final Sequence mB = new A005091();
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

