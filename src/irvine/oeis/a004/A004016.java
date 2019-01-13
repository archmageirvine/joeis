package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.a002.A002324;

/**
 * A004016.
 * @author Sean A. Irvine
 */
public class A004016 extends A002324 {

  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.ONE;
    }
    return super.next().multiply(6);
  }
}
