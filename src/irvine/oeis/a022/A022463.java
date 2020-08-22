package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;
import irvine.oeis.a011.A011757;

/**
 * A022463 a(n) = prime(n^2) mod prime(n).
 * @author Sean A. Irvine
 */
public class A022463 extends A000040 {

  private final A011757 mP = new A011757();

  @Override
  public Z next() {
    return mP.next().mod(super.next());
  }
}
