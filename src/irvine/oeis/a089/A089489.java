package irvine.oeis.a089;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A089489 Smallest k greater than n such that (k^2-n^2, 2*k*n, k^2+n^2) is a primitive Pythagorean triple and the corresponding right triangle has a prime hypotenuse.
 * @author Sean A. Irvine
 */
public class A089489 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z n2 = Z.valueOf(++mN).square();
    long m = mN;
    while (true) {
      if (n2.add(Z.valueOf(++m).square()).isProbablePrime()) {
        return Z.valueOf(m);
      }
    }
  }
}

