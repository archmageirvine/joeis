package irvine.oeis.a168;
// manually knest/jaguarz at 2023-03-13

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a127.A127986;

/**
 * A168177 Number of prime factors of n! + 2^n - 1, counted with multiplicity.
 * @author Georg Fischer
 */
public class A168177 extends Sequence1 {

  private final A127986 mSeq = new A127986();

  {
    mSeq.next();
  }

  @Override
  public Z next() {
    return Z.valueOf(Jaguar.factor(mSeq.next()).bigOmega());
  }
}
