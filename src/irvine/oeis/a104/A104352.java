package irvine.oeis.a104;
// manually sigman0/sigma0s at 2023-03-12

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A104352 Number of divisors of A104350(n).
 * @author Georg Fischer
 */
public class A104352 extends Sequence1 {

  private final A104350 mSeq = new A104350();

  @Override
  public Z next() {
    return Functions.SIGMA0.z(mSeq.next());
  }
}
