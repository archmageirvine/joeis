package irvine.oeis.a035;

import irvine.math.z.Z;

/**
 * A035088.
 * @author Sean A. Irvine
 */
public class A035088 extends A035087 {

  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.ONE;
    }
    return super.next().divide(Math.max(1, mN));
  }
}
