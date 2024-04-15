package irvine.oeis.a272;
// manually sigman0/sigma0s at 2023-03-13

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a003.A003266;

/**
 * A272122 a(n) is the number of positive divisors of A003266(n).
 * @author Georg Fischer
 */
public class A272122 extends Sequence1 {

  private final A003266 mSeq = new A003266();

  {
    mSeq.next();
  }

  @Override
  public Z next() {
    return Functions.SIGMA0.z(mSeq.next());
  }
}
