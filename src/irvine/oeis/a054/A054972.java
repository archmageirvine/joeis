package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a002.A002110;
import irvine.oeis.a007.A007504;

/**
 * A054972 Product of (sum of first n primes) and (product of first n primes).
 * @author Sean A. Irvine
 */
public class A054972 extends A007504 {

  private final Sequence mA = new A002110();
  {
    next();
  }

  @Override
  public Z next() {
    return super.next().multiply(mA.next());
  }
}
