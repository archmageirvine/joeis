package irvine.oeis.a053;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a002.A002110;

/**
 * A053099 When the Euler phi function is iterated with initial value A002110(n) = n-th primorial, a(n) = exponent of largest power of 2 arising in the iteration.
 * @author Sean A. Irvine
 */
public class A053099 extends A002110 {

  {
    setOffset(1);
    super.next();
  }

  @Override
  public Z next() {
    Z s = super.next();
    while (!Z.ONE.equals(s.makeOdd())) {
      s = Jaguar.factor(s).phi();
    }
    return Z.valueOf(s.auxiliary());
  }
}
