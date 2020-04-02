package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A030430 Primes of the form <code>10*n+1</code>.
 * @author Sean A. Irvine
 */
public class A030430 implements Sequence {

  private Z mN = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(10);
      if (mN.isProbablePrime()) {
        return mN;
      }
    }
  }
}

