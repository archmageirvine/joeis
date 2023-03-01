package irvine.oeis.a173;
// manually sigman0/sigma0 at 2023-02-28 16:08

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a048.A048250;
import irvine.oeis.a062.A062821;

/**
 * A173745 Numbers n such that tau(phi(n)) = sigma(rad(n)).
 * @author Georg Fischer
 */
public class A173745 extends Sequence1 {

  private int mN = 0;
  private final A062821 mSeq1 = new A062821();
  private final A048250 mSeq2 = new A048250();

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (mSeq1.next().equals(mSeq2.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}
