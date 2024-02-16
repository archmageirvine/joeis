package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a004.A004593;
import irvine.oeis.a004.A004601;
import irvine.oeis.a025.A025475;

/**
 * A068441 Numbers k such that the k-th digit is the same in e and Pi expansions in base 2.
 * @author Sean A. Irvine
 */
public class A068441 extends A025475 {

  private final Sequence mPi = new A004601().skip(2);
  private final Sequence mE = new A004593().skip(2);
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

