package irvine.oeis.a227;
// manually knest/jaguarz at 2023-03-13

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a053.A053767;

/**
 * A227314 Number of prime factors, with multiplicity, of sum of first n composite numbers.
 * @author Georg Fischer
 */
public class A227314 extends Sequence1 {

  private final A053767 mSeq = new A053767();

  {
    mSeq.next();
  }

  @Override
  public Z next() {
    return Z.valueOf(Jaguar.factor(mSeq.next()).bigOmega());
  }
}
