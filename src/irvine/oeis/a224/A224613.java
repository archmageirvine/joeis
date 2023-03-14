package irvine.oeis.a224;
// manually sigman1/sigma1s at 2023-03-13

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a008.A008588;

/**
 * A224613 a(n) = sigma(6*n).
 * @author Georg Fischer
 */
public class A224613 extends Sequence1 {

  private final A008588 mSeq = new A008588();

  {
    mSeq.next();
  }

  @Override
  public Z next() {
    return Jaguar.factor(mSeq.next()).sigma();
  }
}
