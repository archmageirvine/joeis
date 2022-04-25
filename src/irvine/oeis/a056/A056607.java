package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a002.A002110;
import irvine.oeis.a048.A048633;

/**
 * A056607 a(n) is the n-th primorial divided by squarefree kernel of corresponding central binomial coefficient.
 * @author Sean A. Irvine
 */
public class A056607 extends A002110 {

  private final Sequence mA = new A048633();
  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide(mA.next());
  }
}

