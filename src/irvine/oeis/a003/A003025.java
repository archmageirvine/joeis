package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.a058.A058876;

/**
 * A003025.
 * @author Sean A. Irvine
 */
public class A003025 extends A058876 {

  private int mN = 0;

  @Override
  public Z next() {
    return get(++mN, 1);
  }
}
