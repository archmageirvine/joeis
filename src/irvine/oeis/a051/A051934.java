package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.a002.A002113;

/**
 * A051934 a(n) is the smallest palindrome &gt; a(n-1) such that a(1)+a(2)+...+a(n) is a prime.
 * @author Sean A. Irvine
 */
public class A051934 extends A002113 {

  {
    super.next();
    super.next();
  }
  private Z mSum = super.next(); // 2
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = mSum;
    } else {
      while (true) {
        final Z palin = super.next();
        final Z sum = mSum.add(palin);
        if (sum.isProbablePrime()) {
          mSum = sum;
          mA = palin;
          break;
        }
      }
    }
    return mA;
  }
}
