package irvine.oeis.a395;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A395347 Squarefree part of b^2 - b*c + c^2 for triples (a,b,c) with a&lt;=b&lt;=c, a+b&gt;c, gcd(a,b,c)=1, ordered by perimeter.
 * @author Sean A. Irvine
 */
public class A395347 extends Sequence1 {

  private long mPerimeter = 3;
  private long mA = 1;
  private long mB = 0;

  @Override
  public Z next() {
    while (true) {
      if (++mB > (mPerimeter - mA) / 2) {
        if (++mA > mPerimeter / 3) {
          ++mPerimeter;
          mA = 1;
        }
        mB = mA;
      }
      final long c = mPerimeter - mA - mB;
      if (c >= mB && mA + mB > c && Functions.GCD.l(mA, mB, c) == 1) {
        return Functions.CORE.z(mB * mB - mB * c + c * c);
      }
    }
  }
}
