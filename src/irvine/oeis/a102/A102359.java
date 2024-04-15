package irvine.oeis.a102;
// manually sigman1/sigma1s at 2023-03-12

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002450;

/**
 * A102359 a(n) = sigma((4^n - 1)/3), where sigma(n) is the sum of positive divisors of n.
 * @author Georg Fischer
 */
public class A102359 extends Sequence1 {

  private final A002450 mSeq = new A002450();

  {
    mSeq.next();
  }

  @Override
  public Z next() {
    return Functions.SIGMA.z(mSeq.next());
  }
}
