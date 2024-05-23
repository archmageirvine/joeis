package irvine.oeis.a069;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000142;

/**
 * A069785 a(n) = A061680(n!).
 * @author Sean A. Irvine
 */
public class A069785 extends Sequence1 {

  private final Sequence mA = new A000142().skip();

  @Override
  public Z next() {
    final Z f = mA.next();
    return Functions.SIGMA0.z(f.square()).gcd(Functions.SIGMA0.z(f));
  }
}

