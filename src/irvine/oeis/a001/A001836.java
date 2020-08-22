package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.a000.A000010;

/**
 * A001836 Numbers n such that phi(2n-1) &lt; phi(2n), where phi is Euler's totient function A000010.
 * @author Sean A. Irvine
 */
public class A001836 extends A000010 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z a = super.next();
      final Z b = super.next();
      if (a.compareTo(b) < 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
