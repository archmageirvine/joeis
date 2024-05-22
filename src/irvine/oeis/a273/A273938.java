package irvine.oeis.a273;
// manually sigman1/sigma1 at 2023-03-13

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a061.A061345;

/**
 * A273938 Sum of the divisors of the n-th odd prime power.
 * @author Georg Fischer
 */
public class A273938 extends Sequence1 {

  private final A061345 mSeq = new A061345();

  @Override
  public Z next() {
    return Functions.SIGMA1.z(mSeq.next());
  }
}
