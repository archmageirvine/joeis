package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.a000.A000108;

/**
 * A053429 Numbers n such that Catalan(n)+1 is prime.
 * @author Sean A. Irvine
 */
public class A053429 extends A000108 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (super.next().add(1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
