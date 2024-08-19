package irvine.oeis.a053;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a002.A002110;

/**
 * A053097 a(n) is the number of powers of 2 among the iterates of the Euler phi function when it is iterated with initial value A002110(n), the n-th primorial number.
 * @author Sean A. Irvine
 */
public class A053097 extends A002110 {

  {
    setOffset(1);
    super.next();
  }

  @Override
  public Z next() {
    Z s = super.next();
    while (!Z.ONE.equals(s.makeOdd())) {
      s = Functions.PHI.z(s);
    }
    return Z.valueOf(1 + s.auxiliary());
  }
}
