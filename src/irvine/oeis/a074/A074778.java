package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000045;

/**
 * A074778 Numbers k such that 2^k+1 and F(k) are not relatively prime, where F(k) denotes the k-th Fibonacci number.
 * @author Sean A. Irvine
 */
public class A074778 extends Sequence1 {

  private final Sequence mF = new A000045().skip();
  private Z mA = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mA = mA.multiply2();
      if (!Functions.GCD.z(mA.add(1), mF.next()).equals(Z.ONE)) {
        return Z.valueOf(mN);
      }
    }
  }
}
