package irvine.oeis.a116;
// manually n2 at 2023-05-02 19:56

import irvine.math.z.Z;
import irvine.oeis.a010.A010816;

/**
 * A116916 Expansion of q^(-1/8) * (eta(q)^3 + 3 * eta(q^9)^3) in powers of q^3.
 * @author Georg Fischer
 */
public class A116916 extends A010816 {

  @Override
  public Z next() {
    final Z result = super.next();
    super.next();
    super.next();
    return result;
  }
}
