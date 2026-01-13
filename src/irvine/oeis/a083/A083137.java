package irvine.oeis.a083;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002113;

/**
 * A083137 Smallest palindromic number relatively prime to all the previous terms.
 * @author Sean A. Irvine
 */
public class A083137 extends Sequence1 {

  private final Sequence mPalins = new A002113().skip();
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      final Z p = mPalins.next();
      if (Functions.GCD.z(p, mA).isOne()) {
        mA = mA.lcm(p);
        return p;
      }
    }
  }
}

