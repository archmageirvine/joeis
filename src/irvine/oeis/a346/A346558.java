package irvine.oeis.a346;
// manually dirichcon/dirichcon2 at 2023-03-25 23:56

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a008.A008965;

/**
 * A346558 a(n) = Sum_{d|n} phi(n/d) * (2^d - 1).
 * @author Georg Fischer
 */
public class A346558 extends Sequence1 {

  private int mN = 0;
  private final A008965 mSeq = new A008965();

  @Override
  public Z next() {
    return mSeq.next().multiply(++mN);
  }
}
