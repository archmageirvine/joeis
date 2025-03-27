package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.a050.A050435;

/**
 * A076237 a(n) = A050435(n) mod n.
 * @author Sean A. Irvine
 */
public class A076237 extends A050435 {

  private long mN = 0;

  @Override
  public Z next() {
    return super.next().modZ(++mN);
  }
}
