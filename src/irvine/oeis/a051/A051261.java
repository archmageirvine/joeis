package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.a018.A018219;

/**
 * A051261 Main diagonal of A018219, i.e., (n, n, a_n) is a winning position.
 * @author Sean A. Irvine
 */
public class A051261 extends A018219 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(get(++mN, mN));
  }
}
