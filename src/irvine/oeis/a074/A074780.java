package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000045;

/**
 * A074780 Numbers k such that 2^k-1 and F(k) are relatively prime, where F(k) denotes the k-th Fibonacci number.
 * @author Sean A. Irvine
 */
public class A074780 extends Sequence1 {

  private final Sequence mF = new A000045().skip();
  private Z mA = Z.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mA = mA.multiply2().add(1);
      if (Functions.GCD.z(mA, mF.next()).isOne()) {
        return Z.valueOf(mN);
      }
    }
  }
}
