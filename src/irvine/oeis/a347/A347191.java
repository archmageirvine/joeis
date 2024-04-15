package irvine.oeis.a347;
// manually sigman0/sigma0s at 2023-03-13

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;
import irvine.oeis.a005.A005563;

/**
 * A347191 Number of divisors of n^2-1.
 * @author Georg Fischer
 */
public class A347191 extends Sequence2 {

  private final A005563 mSeq = new A005563();

  {
    mSeq.next();
  }

  @Override
  public Z next() {
    return Functions.SIGMA0.z(mSeq.next());
  }
}
