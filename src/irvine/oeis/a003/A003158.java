package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.a092.A092606;

/**
 * A003158 A self-generating sequence (see Comments in A003156 for the definition).
 * @author Sean A. Irvine
 */
public class A003158 extends A092606 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Z.TWO.equals(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }

}
