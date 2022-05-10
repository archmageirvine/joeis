package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000720;

/**
 * A056812 Number of unitary prime factors of lcm[1..n], i.e., primes in LCM with exponent 1.
 * @author Sean A. Irvine
 */
public class A056812 extends A000720 {

  private final Sequence mA = new A000720();
  private Z mB = null;

  @Override
  public Z next() {
    final Z t = super.next();
    if (mN.isSquare()) {
      mB = mA.next();
    }
    return t.subtract(mB);
  }
}

