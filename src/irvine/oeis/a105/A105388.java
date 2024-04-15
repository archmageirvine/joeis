package irvine.oeis.a105;
// manually sigman0/sigma0 at 2023-03-12

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a019.A019520;

/**
 * A105388 Number of divisors of concatenated even numbers.
 * @author Georg Fischer
 */
public class A105388 extends Sequence1 {

  private final A019520 mSeq = new A019520();

  @Override
  public Z next() {
    return Functions.SIGMA0.z(mSeq.next());
  }
}
