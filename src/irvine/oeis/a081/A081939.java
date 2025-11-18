package irvine.oeis.a081;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002113;

/**
 * A081939 a(1) = 2; a(n+1) is the smallest palindrome &gt; a(n) that has a common factor with a(n).
 * @author Sean A. Irvine
 */
public class A081939 extends Sequence1 {

  private final Sequence mP = new A002113().skip(3);
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.TWO;
    } else {
      while (true) {
        final Z palin = mP.next();
        if (!Functions.GCD.z(palin, mA).isOne()) {
          mA = palin;
          break;
        }
      }
    }
    return mA;
  }
}
