package irvine.oeis.a086;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence2;
import irvine.oeis.a000.A000040;

/**
 * A086917 a(n) = floor(prime(n) - n*(log(n) - log(log(n)) - 1)) for n&gt;=2.
 * @author Sean A. Irvine
 */
public class A086917 extends Sequence2 {

  private final Sequence mP = new A000040().skip();
  private long mN = 1;

  @Override
  public Z next() {
    final CR logn = CR.valueOf(++mN).log();
    return CR.valueOf(mP.next()).subtract(logn.subtract(logn.log()).subtract(1).multiply(mN)).floor();
  }
}
