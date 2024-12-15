package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073627 a(1)=a(2)=1; for n &gt; 2, a(n) is the smallest integer such that a(n) &gt; a(n-1) and a(n)+a(n-1) is prime.
 * @author Sean A. Irvine
 */
public class A073627 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ZERO;
      return Z.ONE;
    } else if (mA.isZero()) {
      mA = Z.ONE;
      return Z.ONE;
    }
    Z t = mA;
    while (true) {
      t = t.add(1);
      if (t.add(mA).isProbablePrime()) {
        mA = t;
        return t;
      }
    }
  }
}
