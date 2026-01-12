package irvine.oeis.a083;

import irvine.math.z.LengthPalindromes;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;

/**
 * A083123 Smallest n-digit palindromic multiple of n, or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A083123 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    if (mN % 10 == 0) {
      return Z.ZERO;
    }
    final Sequence palins = new LengthPalindromes(mN);
    while (true) {
      final Z p = palins.next();
      if (p == null) {
        return Z.ZERO;
      }
      if (p.mod(mN) == 0) {
        return p;
      }
    }
  }
}

