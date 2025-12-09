package irvine.oeis.a082;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a057.A057643;

/**
 * A082457 a(n) = gcd(1+2n, A057643(1+2n)).
 * @author Sean A. Irvine
 */
public class A082457 extends Sequence1 {

  private final DirectSequence mA = new A057643();
  private int mN = 1;

  @Override
  public Z next() {
    mN += 2;
    return Functions.GCD.z(mN, mA.a(mN));
  }
}

