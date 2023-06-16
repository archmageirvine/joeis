package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A057665 Numbers n such that prime(n)+2^prime(n) is prime.
 * @author Sean A. Irvine
 */
public class A057665 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z p = super.next();
      final Z a = p.add(Z.ONE.shiftLeft(p.longValueExact()));
      if (a.isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
