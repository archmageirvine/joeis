package irvine.oeis.a309;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A309059 <code>a(1) = 1;</code> for <code>n &gt; 1, a(n) = 2</code> if the concatenation of all the previous terms is prime and <code>a(n) = 1</code> otherwise.
 * @author Sean A. Irvine
 */
public class A309059 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    if (mN.isProbablePrime()) {
      mN = mN.multiply(10).add(2);
      return Z.TWO;
    } else {
      mN = mN.multiply(10).add(1);
      return Z.ONE;
    }
  }
}
