package irvine.oeis.a069;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000142;

/**
 * A069773.
 * @author Sean A. Irvine
 */
public class A069783 extends Sequence1 {

  private final Sequence mA = new A000142().skip();

  @Override
  public Z next() {
    final Z f = mA.next();
    return Functions.SIGMA0.z(f.pow(3)).gcd(Functions.SIGMA0.z(f));
  }
}

