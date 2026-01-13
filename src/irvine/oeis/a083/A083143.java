package irvine.oeis.a083;

import irvine.math.z.LengthPalindromes;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;

/**
 * A083143 Smallest n-digit palindromic multiple of prime(n), or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A083143 extends A000040 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Z prime = super.next();
    final Sequence palins = new LengthPalindromes(mN);
    while (true) {
      final Z p = palins.next();
      if (p == null) {
        return Z.ZERO;
      }
      if (p.mod(prime).isZero()) {
        return p;
      }
    }
  }
}

