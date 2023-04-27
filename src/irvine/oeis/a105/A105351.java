package irvine.oeis.a105;
// manually sigman0/sigma0 at 2023-03-12

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a019.A019519;

/**
 * A105351 Number of divisors of 135...(2n-1), the concatenation of the first n odd numbers.
 * @author Georg Fischer
 */
public class A105351 extends Sequence1 {

  private final A019519 mSeq = new A019519();

  @Override
  public Z next() {
    return Jaguar.factor(mSeq.next()).sigma0();
  }
}
