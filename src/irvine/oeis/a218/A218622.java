package irvine.oeis.a218;

import irvine.math.z.Z;
import irvine.oeis.a183.A183161;

/**
 * A218622 a(n) = A183161(n) (mod 4), n&gt;=0.
 * @author Georg Fischer
 */
public class A218622 extends A183161 {

  @Override
  public Z next() {
    return super.next().mod(Z.FOUR);
  }
}
