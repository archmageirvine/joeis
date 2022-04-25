package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a034.A034386;
import irvine.oeis.a048.A048633;

/**
 * A056610 Quotient: squarefree kernel of lcm(1,..,n) (or of n!) divided by kernel of central binomial coefficient.
 * @author Sean A. Irvine
 */
public class A056610 extends A034386 {

  private final Sequence mA = new A048633();
  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide(mA.next());
  }
}

