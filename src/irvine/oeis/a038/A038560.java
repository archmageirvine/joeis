package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a032.A032347;

/**
 * A038560 Binomial recurrence coefficients.
 * @author Sean A. Irvine
 */
public class A038560 extends A038559  {

  private final Sequence mA = new A032347();

  @Override
  public Z next() {
    return super.next().add(mA.next());
  }
}
