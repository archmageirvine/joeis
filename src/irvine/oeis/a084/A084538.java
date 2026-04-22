package irvine.oeis.a084;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence2;
import irvine.oeis.a000.A000040;

/**
 * A084538 Least primitive root mod 2*prime(n)^2.
 * @author Sean A. Irvine
 */
public class A084538 extends Sequence2 {

  private final Sequence mP = new A000040().skip();

  @Override
  public Z next() {
    return Functions.LEAST_PRIMITIVE_ROOT.z(mP.next().square().multiply2());
  }
}
