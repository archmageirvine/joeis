package irvine.oeis.a087;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a025.A025586;

/**
 * A087260 a(n) = gcd(4n, A025586(4n)), greatest common divisor of 4n and largest value in 3x+1 iteration list started at 4n.
 * @author Sean A. Irvine
 */
public class A087260 extends Sequence1 {

  private final DirectSequence mA = new A025586();
  private long mN = 0;

  @Override
  public Z next() {
    mN += 4;
    return Functions.GCD.z(mN, mA.a(mN));
  }
}

