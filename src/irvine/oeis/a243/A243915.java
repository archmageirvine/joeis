package irvine.oeis.a243;
// manually sigman1/sigma1s at 2023-03-13

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;
import irvine.oeis.a001.A001221;

/**
 * A243915 a(n) = sigma(omega(n)).
 * @author Georg Fischer
 */
public class A243915 extends Sequence2 {

  private final A001221 mSeq = new A001221();

  {
    mSeq.next();
  }

  @Override
  public Z next() {
    return Jaguar.factor(mSeq.next()).sigma();
  }
}
