package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A072467 Triangle in which n-th row contains n primes == 1 mod (n) and the first term of a row is just greater than the last term of the previous row.
 * @author Sean A. Irvine
 */
public class A072467 extends A000040 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM >= mN) {
      mM = 0;
      if (++mN == 1) {
        return super.next(); // avoid need for 1 % mN later
      }
    }
    while (true) {
      final Z p = super.next();
      if (p.mod(mN) == 1) {
        return p;
      }
    }
  }
}

