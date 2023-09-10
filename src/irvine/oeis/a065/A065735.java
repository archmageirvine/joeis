package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.a002.A002110;

/**
 * A065735 Largest square &lt;= product of first n primes.
 * @author Sean A. Irvine
 */
public class A065735 extends A002110 {

  {
    super.next();
    setOffset(1);
  }

  @Override
  public Z next() {
    return super.next().sqrt().square();
  }
}
