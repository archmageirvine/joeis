package irvine.oeis.a104;
// manually sigman0/sigma0s at 2023-03-12

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A104352 Number of divisors of A104350(n).
 * @author Georg Fischer
 */
public class A104352 extends Sequence2 {

  private final A104350 mSeq = new A104350();

  {
    mSeq.next();
  }

  @Override
  public Z next() {
    return Jaguar.factor(mSeq.next()).sigma0();
  }
}
