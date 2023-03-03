package irvine.oeis.a087;
// manually knest/eulphi at 2023-03-01 16:41

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a004.A004042;

/**
 * A087026 Euler&apos;s totient of n-th cyclic number.
 * @author Georg Fischer
 */
public class A087026 extends A004042 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return Jaguar.factor(super.next()).phi();
  }
}
