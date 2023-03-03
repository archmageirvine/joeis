package irvine.oeis.a253;
// manually knest/jaguar at 2023-03-01 16:41

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a051.A051682;

/**
 * A253254 Largest prime factor of the n-th 11-gonal number.
 * @author Georg Fischer
 */
public class A253254 extends A051682 {

  {
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return Jaguar.factor(super.next()).largestPrimeFactor();
  }
}
