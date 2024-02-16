package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a004.A004594;
import irvine.oeis.a004.A004602;
import irvine.oeis.a025.A025475;

/**
 * A068442 Numbers n such that the n-th digit is the same in e and Pi expansions in base 3.
 * @author Sean A. Irvine
 */
public class A068442 extends A025475 {

  private final Sequence mPi = new A004602().skip(2);
  private final Sequence mE = new A004594().skip();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (mPi.next().equals(mE.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}

