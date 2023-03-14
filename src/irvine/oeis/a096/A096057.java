package irvine.oeis.a096;
// manually knest/jaguar at 2023-03-12

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002627;

/**
 * A096057 a(1) = 1, a(n) = least prime divisor of b(n), where b(1) = 1, b(n) = n*b(n-1) + 1 = A002627(n).
 * @author Georg Fischer
 */
public class A096057 extends Sequence1 {

  private final A002627 mSeq = new A002627();

  {
    mSeq.next();
  }

  @Override
  public Z next() {
    return Jaguar.factor(mSeq.next()).leastPrimeFactor();
  }
}
