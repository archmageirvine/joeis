package irvine.oeis.a040;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A040175 a(n) = n! times probability that an ordered pair of elements of S_n chosen at random (with replacement) generate S_n.
 * @author Sean A. Irvine
 */
public class A040175 extends A040173 {

  {
    super.next();
    super.next();
    setOffset(3);
  }

  @Override
  protected Z select(final Q n) {
    return n.multiply(MemoryFactorial.SINGLETON.factorial(mN)).toZ();
  }
}
