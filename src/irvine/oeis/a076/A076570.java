package irvine.oeis.a076;
// manually knest/jaguar at 2023-03-12

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a007.A007504;

/**
 * A076570 Greatest prime divisor of sum of first n primes.
 * @author Georg Fischer
 */
public class A076570 extends Sequence1 {

  private final A007504 mSeq = new A007504();

  {
    mSeq.next();
  }

  @Override
  public Z next() {
    return Functions.GPF.z(mSeq.next());
  }
}
