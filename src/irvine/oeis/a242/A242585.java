package irvine.oeis.a242;
// manually sigman0/sigma0 at 2023-03-13

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001110;

/**
 * A242585 Number of divisors of the n-th positive number that is both triangular and square.
 * @author Georg Fischer
 */
public class A242585 extends Sequence1 {

  private final A001110 mSeq = new A001110();

  {
    mSeq.next();
  }

  @Override
  public Z next() {
    return Functions.SIGMA0.z(mSeq.next());
  }
}
