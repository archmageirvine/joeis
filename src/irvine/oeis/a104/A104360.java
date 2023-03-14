package irvine.oeis.a104;
// manually knest/jaguarz at 2023-03-12

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A104360 Number of distinct prime factors of A104357(n) = A104350(n) - 1.
 * @author Georg Fischer
 */
public class A104360 extends Sequence2 {

  private final A104357 mSeq = new A104357();

  {
    mSeq.next();
  }

  @Override
  public Z next() {
    return Z.valueOf(Jaguar.factor(mSeq.next()).omega());
  }
}
