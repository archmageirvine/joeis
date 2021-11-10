package irvine.oeis.a090;

import irvine.math.z.Z;
import irvine.oeis.a053.A053838;

/**
 * A090193 a(n) = A053838(n) + 1 modulo 3.
 * @author Georg Fischer
 */
public class A090193 extends A053838 {

  @Override
  public Z next() {
    return super.next().add(1).mod(Z.THREE);
  }
}
