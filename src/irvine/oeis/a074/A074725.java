package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000045;
import irvine.oeis.a000.A000984;

/**
 * A074696.
 * @author Sean A. Irvine
 */
public class A074725 extends Sequence1 {

  private long mN = 0;
  private final Sequence mF = new A000045().skip();
  private final Sequence mC = new A000984().skip();

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (mF.next().gcd(mC.next()).equals(Z.ONE)) {
        return Z.valueOf(mN);
      }
    }
  }
}
