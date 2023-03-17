package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.a008.A008683;

/**
 * A080847 a(n) = mu(n)+2, where mu is the Moebius function (A008683).
 * @author Georg Fischer
 */
public class A080847 extends A008683 {

  @Override
  public Z next() {
    return super.next().add(2);
  }
}
