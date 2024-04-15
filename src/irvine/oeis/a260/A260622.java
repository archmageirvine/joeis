package irvine.oeis.a260;
// manually sigman1/sigma1s at 2023-03-13

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a003.A003266;

/**
 * A260622 a(n) is the sum of the positive divisors of A003266(n).
 * @author Georg Fischer
 */
public class A260622 extends Sequence1 {

  private final A003266 mSeq = new A003266();

  {
    mSeq.next();
  }

  @Override
  public Z next() {
    return Functions.SIGMA.z(mSeq.next());
  }
}
