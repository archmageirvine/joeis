package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.a092.A092606;

/**
 * A003157 A self-generating sequence (see Comments in A003156 for the definition).
 * @author Sean A. Irvine
 */
public class A003157 extends A092606 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Z.ONE.equals(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }

}
