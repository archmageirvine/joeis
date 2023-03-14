package irvine.oeis.a346;
// manually sigman1/sigma1s at 2023-03-13

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a014.A014105;

/**
 * A346866 Sum of divisors of the n-th second hexagonal number.
 * @author Georg Fischer
 */
public class A346866 extends Sequence1 {

  private final A014105 mSeq = new A014105();

  {
    mSeq.next();
  }

  @Override
  public Z next() {
    return Jaguar.factor(mSeq.next()).sigma();
  }
}
