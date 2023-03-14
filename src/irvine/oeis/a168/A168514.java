package irvine.oeis.a168;
// manually knest/jaguarz at 2023-03-13

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001611;

/**
 * A168514 Number of prime divisors (counted with multiplicity) of Fibonacci(n)+1.
 * @author Georg Fischer
 */
public class A168514 extends Sequence1 {

  private final A001611 mSeq = new A001611();

  {
    mSeq.next();
  }

  @Override
  public Z next() {
    return Z.valueOf(Jaguar.factor(mSeq.next()).bigOmega());
  }
}
