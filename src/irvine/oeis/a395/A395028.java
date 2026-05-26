package irvine.oeis.a395;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A395028 a(1) = 1; a(n) is the smallest integer so that a(n) &gt; a(n-1) and a(n)^4+a(n-1)^4 is prime.
 * @author Sean A. Irvine
 */
public class A395028 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      final Z a4 = mA.pow(4);
      do {
        mA = mA.add(1);
      } while (!a4.add(mA.pow(4)).isProbablePrime());
    }
    return mA;
  }
}
