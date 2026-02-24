package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000045;

/**
 * A074215 Numbers m such that m and F(m) are relatively prime, where F(m) denotes the m-th Fibonacci number.
 * @author Sean A. Irvine
 */
public class A074215 extends Sequence1 {

  private final Sequence mF = new A000045();
  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (mF.next().gcd(++mN).isOne()) {
        return Z.valueOf(mN);
      }
    }
  }
}
