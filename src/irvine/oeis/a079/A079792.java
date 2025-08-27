package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079792 a(1) = 1, a(n) = a(n-1)/gcd(a(n-1),n) if gcd(a(n-1),n) &gt; 1 otherwise a(n) is the concatenation of a(n-1) and n.
 * @author Sean A. Irvine
 */
public class A079792 extends Sequence1 {

  private Z mA = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN > 1) {
      final Z d = Functions.GCD.z(mA, mN);
      if (d.isOne()) {
        mA = new Z(mA.toString() + mN);
      } else {
        mA = mA.divide(d);
      }
    }
    return mA;
  }
}

