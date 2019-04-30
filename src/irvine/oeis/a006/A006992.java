package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006992 Bertrand primes: <code>a(n)</code> is largest prime <code>&lt; 2*a(n-1)</code> for <code>n &gt; 1</code>, with <code>a(1) = 2</code>.
 * @author Sean A. Irvine
 */
public class A006992 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.TWO;
    } else {
      mA = mA.multiply2();
      do {
        mA = mA.subtract(1);
      } while (!mA.isProbablePrime());
    }
    return mA;
  }
}

