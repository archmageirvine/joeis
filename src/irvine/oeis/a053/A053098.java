package irvine.oeis.a053;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.a002.A002110;

/**
 * A053098 When the Euler phi function is iterated with initial value A002110(n)=primorial, a(n)= first (maximal) power of 2 emerging during iteration.
 * @author Sean A. Irvine
 */
public class A053098 extends A002110 {

  {
    setOffset(1);
    super.next();
  }

  @Override
  public Z next() {
    Z s = super.next();
    while (!Z.ONE.equals(s.makeOdd())) {
      s = Euler.phi(s);
    }
    return s;
  }
}
