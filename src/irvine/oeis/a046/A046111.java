package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046111.
 * @author Sean A. Irvine
 */
public class A046111 extends A046080 {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 2) {
      super.next();
      mN = 0;
    }
    return super.next().multiply2().add(1);
  }
}
