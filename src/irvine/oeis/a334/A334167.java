package irvine.oeis.a334;
// manually sigman0/sigma0s at 2023-03-13

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;
import irvine.oeis.a048.A048861;

/**
 * A334167 a(n) is the number of divisors of n^n-1.
 * @author Georg Fischer
 */
public class A334167 extends Sequence2 {

  private final A048861 mSeq = new A048861();

  {
    mSeq.next();
  }

  @Override
  public Z next() {
    return Jaguar.factor(mSeq.next()).sigma0();
  }
}
