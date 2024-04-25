package irvine.oeis.a143;
// manually sigman0/sigma0 at 2023-02-28 16:08

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;
import irvine.oeis.a005.A005179;

/**
 * A143525 a(n) is the number of divisors of (A005179(n)-1), where A005179(n) is the smallest positive integer with n divisors.
 * @author Georg Fischer
 */
public class A143525 extends Sequence2 {

  private final A005179 mSeq = new A005179();

  {
    mSeq.next();
  }

  @Override
  public Z next() {
    return Functions.SIGMA0.z(mSeq.next().subtract(1));
  }
}
