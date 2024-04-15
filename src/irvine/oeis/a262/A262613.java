package irvine.oeis.a262;
// manually sigman1/sigma1s at 2023-03-13

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001318;

/**
 * A262613 Sum of divisors of n-th generalized pentagonal number.
 * @author Georg Fischer
 */
public class A262613 extends Sequence1 {

  private final A001318 mSeq = new A001318();

  {
    mSeq.next();
  }

  @Override
  public Z next() {
    return Functions.SIGMA.z(mSeq.next());
  }
}
