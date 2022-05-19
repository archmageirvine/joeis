package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.a055.A055165;

/**
 * A056990 Number of nonsingular n X n (-1,1)-matrices.
 * @author Sean A. Irvine
 */
public class A056990 extends A055165 {

  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.TWO;
    }
    return super.next().shiftLeft(2 * mN + 1);
  }
}
