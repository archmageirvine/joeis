package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.a069.A069241;

/**
 * A003274.
 * @author Sean A. Irvine
 */
public class A003274 extends A069241 {

  private int mN = 0;

  @Override
  public Z next() {
    if (mN < 2) {
      ++mN;
      super.next();
      return Z.ONE;
    }
    return super.next().multiply2();
  }

}
