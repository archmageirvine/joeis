package irvine.oeis.a100;
// manually knest/jaguar at 2023-03-12

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;
import irvine.oeis.a061.A061113;

/**
 * A100757 Smallest prime factor of the concatenation of terms of the n-th row of the Stirling's number of the second kind.
 * @author Georg Fischer
 */
public class A100757 extends Sequence2 {

  private final A061113 mSeq = new A061113();

  {
    mSeq.next();
  }

  @Override
  public Z next() {
    return Jaguar.factor(mSeq.next()).leastPrimeFactor();
  }
}
