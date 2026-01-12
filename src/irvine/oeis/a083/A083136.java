package irvine.oeis.a083;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002113;

/**
 * A083136 a(n+1) is the smallest palindrome greater than a(n) and relatively prime to a(n).
 * @author Sean A. Irvine
 */
public class A083136 extends Sequence1 {

  private final Sequence mPalins = new A002113().skip();
  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      final Z p = mPalins.next();
      if (Functions.GCD.l(p, mA) == 1) {
        mA = p;
        return p;
      }
    }
  }
}

