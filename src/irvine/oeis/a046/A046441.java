package irvine.oeis.a046;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046441 Never reaches a prime under "Sum of digits raised to its digits' powers" procedure.
 * @author Sean A. Irvine
 */
public class A046441 implements Sequence {

  private long mN = 0;

  private boolean is(final long n) {
    Z m = Z.valueOf(n);
    final TreeSet<Z> seen = new TreeSet<>();
    seen.add(m);
    do {
      m = A046432.sumOfDigitPowers(m);
      if (m.isProbablePrime()) {
        return false;
      }
    } while (seen.add(m));
    return true;
  }

  @Override
  public Z next() {
    while (!is(++mN)) {
      // do nothing
    }
    return Z.valueOf(mN);
  }
}
