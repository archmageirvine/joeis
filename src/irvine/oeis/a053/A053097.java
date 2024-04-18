package irvine.oeis.a053;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a002.A002110;

/**
 * A053097 When the Euler phi function is iterated with initial value A002110(n) = primorial, a(n) = number of powers of 2 among iterates.
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
