package irvine.oeis.a102;
// manually knest/jaguarz at 2023-03-12

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a007.A007504;

/**
 * A102862 Numbers of prime factors of the sum of the first n primes.
 * @author Georg Fischer
 */
public class A102862 extends Sequence1 {

  private final A007504 mSeq = new A007504();

  {
    mSeq.next();
  }

  @Override
  public Z next() {
    return Z.valueOf(Jaguar.factor(mSeq.next()).bigOmega());
  }
}
