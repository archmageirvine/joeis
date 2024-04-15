package irvine.oeis.a276;
// manually sigman0/sigma0s at 2023-03-13

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001107;

/**
 * A276683 Number of divisors of the n-th 10-gonal number.
 * @author Georg Fischer
 */
public class A276683 extends Sequence1 {

  private final A001107 mSeq = new A001107();

  {
    mSeq.next();
  }

  @Override
  public Z next() {
    return Functions.SIGMA0.z(mSeq.next());
  }
}
