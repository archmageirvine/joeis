package irvine.oeis.a114;
// manually sigman1/sigma1s at 2023-03-12

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a007.A007689;

/**
 * A114705 Sum of divisors of 2^n + 3^n.
 * @author Georg Fischer
 */
public class A114705 extends Sequence1 {

  private final A007689 mSeq = new A007689();

  {
    mSeq.next();
  }

  @Override
  public Z next() {
    return Functions.SIGMA.z(mSeq.next());
  }
}
