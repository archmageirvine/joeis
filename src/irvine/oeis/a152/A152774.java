package irvine.oeis.a152;
// manually sigman0/sigma0 at 2023-03-13

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000045;

/**
 * A152774 Number of proper divisors of the Fibonacci number A000045(n).
 * @author Georg Fischer
 */
public class A152774 extends Sequence1 {

  private final A000045 mSeq = new A000045();

  {
    mSeq.next();
  }

  @Override
  public Z next() {
    return Jaguar.factor(mSeq.next()).sigma0().subtract(1);
  }
}
